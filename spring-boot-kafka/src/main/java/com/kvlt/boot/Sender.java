package com.kvlt.boot;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kvlt.boot.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

/**
 * Sender
 *
 * @author KVLT
 * @date 2017-12-17.
 */
@Component
public class Sender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private Gson gson = new GsonBuilder().create();

    public void send(String topic) {
        Message m = new Message();
        m.setId(System.currentTimeMillis());
        m.setMsg(UUID.randomUUID().toString());
        m.setSendTime(new Date());

        kafkaTemplate.send(topic, gson.toJson(m));
    }

    public void send(String topic, String content) {
        Message m = new Message();
        m.setId(System.currentTimeMillis());
        m.setMsg(content);
        m.setSendTime(new Date());

        kafkaTemplate.send(topic, gson.toJson(m));
    }

    public void send(String topic, String key, String content) {
        Message m = new Message();
        m.setId(System.currentTimeMillis());
        m.setMsg(content + " ... ");
        m.setSendTime(new Date());

        kafkaTemplate.send(topic, key, content);
    }

}
