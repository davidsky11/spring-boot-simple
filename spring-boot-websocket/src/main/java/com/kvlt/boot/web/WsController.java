package com.kvlt.boot.web;

import com.kvlt.boot.entity.KvMessage;
import com.kvlt.boot.entity.KvResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * WsController
 *
 * @author KVLT
 * @date 2017-12-20.
 */
@Controller
public class WsController {

    /**
     *  1、当浏览器向服务端发送请求时，通过 @MessageMapping 映射 /welcome 这个地址
     *  2、当服务端有消息时，会对订阅了 @SendTo 中的路径的浏览器发送消息
     */

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public KvResponse say(KvMessage msg) throws Exception {
        Thread.sleep(3000);
        return new KvResponse("Welcome, " + msg.getName());
    }
}
