package com.doudouj.consumer;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: PayComsumerUtil
 * @Author: doudou
 * @Datetime: 2019/12/4-15:52
 * @Description: 支付消息消费工具类
 */
@Component
@RocketMQMessageListener(topic = "javastudy", consumerGroup = "pay-group")
public class PayConsumerUtil implements RocketMQListener<String> {

    @Override
    public void onMessage(String s) {
        System.out.println("get message: " + s);
    }
}
