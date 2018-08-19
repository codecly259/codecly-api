package top.codecly.api.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.codecly.api.entity.UserEntity;

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
        UserEntity user = new UserEntity();
        user.setUserId(1);
        user.setAge(16);
        user.setName("马新春");
        user.setAddress("地球村");
        log.info("Sender:" + user);
        this.amqpTemplate.convertAndSend("hello", user);
    }

}
