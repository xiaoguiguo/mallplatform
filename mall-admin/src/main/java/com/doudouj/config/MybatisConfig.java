package com.doudouj.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName: MybatisConfig
 * @Author: doudou
 * @Datetime: 2019/11/22-17:03
 * @Description: mybatis配置类
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.doudouj.dao"})
public class MybatisConfig {
}
