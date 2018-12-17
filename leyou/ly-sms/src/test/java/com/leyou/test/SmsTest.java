package com.leyou.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmsTest {

    @Autowired
    private AmqpTemplate template;

    @Test
    public void testSendMsg(){
        Map<String,String> msg = new HashMap<>();
        msg.put("phone", "18721546684");
        msg.put("code", "123321");
        template.convertAndSend("ly.sms.exchange", "sms.verify.code", msg);
    }
}
