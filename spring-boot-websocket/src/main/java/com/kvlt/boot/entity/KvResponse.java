package com.kvlt.boot.entity;

/**
 * KvResponse
 * 服务端向浏览器发送的此类的消息
 * @author KVLT
 * @date 2017-12-20.
 */
public class KvResponse {

    private String responseMessage;

    public KvResponse() {}

    public KvResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

}
