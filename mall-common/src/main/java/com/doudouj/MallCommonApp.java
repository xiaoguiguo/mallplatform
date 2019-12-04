package com.doudouj;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

/**
 * @ClassName: MallCommonApp
 * @Author: doudou
 * @Datetime: 2019/11/27-16:43
 * @Description: 公共启动类
 */
@SpringBootApplication
public class MallCommonApp {

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    public static void main(String[] args) {
        SpringApplication.run(MallCommonApp.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            rocketMQTemplate.convertAndSend("javastudy", "good good study, day day up");
        };
    }
}
