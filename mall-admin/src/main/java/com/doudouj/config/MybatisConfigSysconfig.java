package com.doudouj.config;

import com.doudouj.properties.SysconfigDatabaseProperties;
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
 * @ClassName: MybatisConfigSysconfig
 * @Author: doudou
 * @Datetime: 2019/11/25-14:43
 * @Description: sysconfig库配置
 */
@Configuration
@MapperScan(basePackages = "com.doudouj.dao.sysconfig", sqlSessionFactoryRef = "sysconfigSqlSessionFactory", sqlSessionTemplateRef = "sysconfigSqlSessionTemplate")
@Slf4j
public class MybatisConfigSysconfig {

    @Autowired
    private SysconfigDatabaseProperties prop;

    @Bean(name = "sysconfigDataSource")
    public DataSource sysconfigDataSource() {
        return DataSourceBuilder.create()
                .driverClassName(prop.getDriver())
                .type(getType(prop.getType()))
                .username(prop.getUsername())
                .password(prop.getPassword())
                .url(prop.getUrl())
                .build();
    }

    @Bean(name = "sysconfigSqlSessionFactory")
    SqlSessionFactory sysconfigSqlSessionFactory(@Qualifier("sysconfigDataSource") DataSource dataSource) {
        SqlSessionFactory sessionFactory = null;
        try {
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            bean.setDataSource(dataSource);
            bean.setMapperLocations(new PathMatchingResourcePatternResolver()
                    .getResources("classpath*:/mapper/sysconfig/**/*.xml"));
            sessionFactory = bean.getObject();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return sessionFactory;
    }

    @Bean(name = "sysconfigTransactionManager")
    public DataSourceTransactionManager accountTransactionManager(@Qualifier("sysconfigDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "sysconfigSqlSessionTemplate")
    SqlSessionTemplate sysconfigSqlSessionTemplate(@Qualifier("sysconfigSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
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
