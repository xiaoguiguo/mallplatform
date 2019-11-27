package com.doudouj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ClassName: MallAdminApp
 * @Author: doudou
 * @Datetime: 2019/11/22-14:04
 * @Description: 后管服务
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MallAdminApp {

    public static void main(String[] args) {
        SpringApplication.run(MallAdminApp.class, args);
    }
}
