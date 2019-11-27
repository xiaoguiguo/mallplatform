package com.doudouj.task;

import cn.hutool.core.lang.UUID;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;

/**
 * @ClassName: Task
 * @Author: doudou
 * @Datetime: 2019/11/27-16:53
 * @Description: 模拟生产者发送消息
 */
@Component
@Slf4j
public class Task {
    @Resource
    private DefaultMQProducer producer;

    // 每个十秒发送一次消息
    @Scheduled(cron = "0/10 * * * * ?")
    private void sendMsgToMq() {
        String str = "发送消息测试";
        Message msg;
        try {
            msg = new Message("topic-mallpf", "tag-mallpf", UUID.randomUUID().toString(), str.getBytes("utf-8"));
            SendResult result = producer.send(msg);
            log.info("消息发送响应信息：" + result.toString());
        } catch (UnsupportedEncodingException | MQClientException | RemotingException | MQBrokerException | InterruptedException e) {
            log.error(e.getMessage());
        }
    }
}
