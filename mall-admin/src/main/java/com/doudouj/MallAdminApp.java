package com.doudouj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: MallAdminApp
 * @Author: doudou
 * @Datetime: 2019/11/22-14:04
 * @Description: 后管服务
 */
@SpringBootApplication
@MapperScan("com.doudouj.dao.accounts")
public class MallAdminApp {

    public static void main(String[] args) {
        SpringApplication.run(MallAdminApp.class, args);
    }
}
