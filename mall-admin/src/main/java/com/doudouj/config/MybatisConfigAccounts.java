package com.doudouj.config;

import com.doudouj.properties.AccountsDatabaseProperties;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @ClassName: MybatisConfigAccounts
 * @Author: doudou
 * @Datetime: 2019/11/25-14:43
 * @Description: accounts库配置
 */
@Configuration
@MapperScan(basePackages = "com.doudouj.dao.accounts", sqlSessionFactoryRef = "accountsSqlSessionFactory", sqlSessionTemplateRef = "accountsSqlSessionTemplate")
@Slf4j
public class MybatisConfigAccounts {

    @Autowired
    private AccountsDatabaseProperties prop;

    @Bean(name = "accountsDataSource")
    public DataSource accountsDataSource() {
        return DataSourceBuilder.create()
                .driverClassName(prop.getDriver())
                .type(getType(prop.getType()))
                .username(prop.getUsername())
                .password(prop.getPassword())
                .url(prop.getUrl())
                .build();
    }

    @Bean(name = "accountsSqlSessionFactory")
    SqlSessionFactory accountsSqlSessionFactory(@Qualifier("accountsDataSource") DataSource dataSource) {
        SqlSessionFactory sessionFactory = null;
        try {
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            bean.setDataSource(dataSource);
            bean.setMapperLocations(new PathMatchingResourcePatternResolver()
                    .getResources("classpath*:/mapper/accounts/**/*.xml"));
            sessionFactory = bean.getObject();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return sessionFactory;
    }

    @Bean(name = "accountsTransactionManager")
    public DataSourceTransactionManager accountTransactionManager(@Qualifier("accountsDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "accountsSqlSessionTemplate")
    SqlSessionTemplate accountsSqlSessionTemplate(@Qualifier("accountsSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    private Class getType(String type) {
        try {
            return Class.forName(type);
        } catch (ClassNotFoundException e) {
            log.error(e.getMessage());
        }
        return null;
    }

}
