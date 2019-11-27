package com.doudouj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @ClassName: MallCommonApp
 * @Author: doudou
 * @Datetime: 2019/11/27-16:43
 * @Description: 公共启动类
 */
@SpringBootApplication
@EnableScheduling
public class MallCommonApp {

    public static void main(String[] args) {
        SpringApplication.run(MallCommonApp.class, args);
    }
}
