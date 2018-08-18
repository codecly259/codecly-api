package top.codecly.api.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName Sender
 * @Description 生产者
 * @Author maxinchun
 * @Date 2018/8/17 23:16
 */
@Component
@Slf4j
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hello" + new Date();
        log.info("Sender:" + context);
        this.amqpTemplate.convertAndSend("hello", context);
    }

}
