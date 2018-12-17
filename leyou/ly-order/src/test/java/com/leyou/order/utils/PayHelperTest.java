package com.leyou.order.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PayHelperTest {

    @Autowired
    private PayHelper payHelper;

    @Test
    public void createPayUrl() {
        String payUrl = payHelper.createPayUrl(34253252L, 1L, "乐优商城测试！");

        System.out.println("payUrl = " + payUrl);
    }
}