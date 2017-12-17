package com.kvlt.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * MqApplicationTest
 *
 * @author KVLT
 * @date 2017-12-17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = KafkaApplication.class)
public class KafkaApplicationTest {

    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception {
        sender.send("mykafka", "msg","test");
    }

    @Test
    public void hello1() throws Exception {
        sender.send("mykafka");
    }

}