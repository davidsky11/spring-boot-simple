package com.kvlt.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * MqApplication
 *
 * @author KVLT
 * @date 2017-12-17.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class KafkaApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext app = SpringApplication.run(KafkaApplication.class, args);

        /*while(true){
            Sender sender = app.getBean(Sender.class);
            sender.send("mykafka");
            Thread.sleep(1000);
        }*/

    }

}
