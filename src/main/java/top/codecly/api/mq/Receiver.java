package top.codecly.api.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName Receiver
 * @Description 消费者
 * @Author maxinchun
 * @Date 2018/8/17 23:19
 */
@Component
@RabbitListener(queues = "hello")
@Slf4j
public class Receiver {

    @RabbitHandler
    public void process(String hello) {
        log.info("Receiver: " + hello);
    }


}
