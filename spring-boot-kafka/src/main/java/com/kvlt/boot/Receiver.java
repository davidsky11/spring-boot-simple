package com.kvlt.boot;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kvlt.boot.entity.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Receiver
 *
 * @author KVLT
 * @date 2017-12-17.
 */
@Component
public class Receiver {

    private static Logger logger = LoggerFactory.getLogger(Receiver.class);

    private Gson gson = new GsonBuilder().create();

    @KafkaListener(topics = "mykafka")
    public void process(String content) {
        Message m = gson.fromJson(content, Message.class);
        logger.info(" MSG : ", m.toString());
    }

}
