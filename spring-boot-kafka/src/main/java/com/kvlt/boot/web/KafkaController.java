package com.kvlt.boot.web;

import com.kvlt.boot.Sender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * KafkaController
 *
 * @author KVLT
 * @date 2017-12-17.
 */
@Controller
public class KafkaController {

    private static Logger logger = LoggerFactory.getLogger(KafkaController.class);

    @Autowired
    private Sender sender;

    @RequestMapping("/send")
    @ResponseBody
    String send(String topic, String key, String data) {
        sender.send(topic);
        return "success";
    }

}
