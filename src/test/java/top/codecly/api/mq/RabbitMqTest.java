package top.codecly.api.mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName RabbitMqTest
 * @Description TODO
 * @Author maxinchun
 * @Date 2018/8/17 23:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqTest {

    @Autowired
    private Sender sender;

    @Test
    public void hello() {
        sender.send();
    }

}
