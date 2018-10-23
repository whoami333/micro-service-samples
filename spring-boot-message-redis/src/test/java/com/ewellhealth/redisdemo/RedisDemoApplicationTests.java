package com.ewellhealth.redisdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
//@SpringBootTest
public class RedisDemoApplicationTests {

    @Test
    public void contextLoads() {
        try (Jedis jedis = new Jedis("localhost")) {
            jedis.set("foo", "bar");
            String value = jedis.get("foo");
            System.out.println("value");
        } catch (Exception e) {

        }
    }

}
