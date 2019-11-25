package com.doudouj.config;

import com.doudouj.properties.CheckDatabaseProperties;
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

import javax.sql.DataSource;

/**
 * @ClassName: MybatisConfigCheck
 * @Author: doudou
 * @Datetime: 2019/11/25-14:43
 * @Description: check库配置
 */
@Configuration
@MapperScan(basePackages = "com.doudouj.dao.check", sqlSessionFactoryRef = "checkSqlSessionFactory", sqlSessionTemplateRef = "checkSqlSessionTemplate")
@Slf4j
public class MybatisConfigCheck {

    @Autowired
    private CheckDatabaseProperties prop;

    @Bean(name = "checkDataSource")
    public DataSource checkDataSource() {
        return DataSourceBuilder.create()
                .driverClassName(prop.getDriver())
                .type(getType(prop.getType()))
                .username(prop.getUsername())
                .password(prop.getPassword())
                .url(prop.getUrl())
                .build();
    }

    @Bean(name = "checkSqlSessionFactory")
    SqlSessionFactory checkSqlSessionFactory(@Qualifier("checkDataSource") DataSource dataSource) {
        SqlSessionFactory sessionFactory = null;
        try {
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            bean.setDataSource(dataSource);
            bean.setMapperLocations(new PathMatchingResourcePatternResolver()
                    .getResources("classpath*:/mapper/check/**/*.xml"));
            sessionFactory = bean.getObject();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return sessionFactory;
    }

    @Bean(name = "checkTransactionManager")
    public DataSourceTransactionManager accountTransactionManager(@Qualifier("checkDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "checkSqlSessionTemplate")
    SqlSessionTemplate checkSqlSessionTemplate(@Qualifier("checkSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
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
