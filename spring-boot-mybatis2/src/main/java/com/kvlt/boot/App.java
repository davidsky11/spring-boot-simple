package com.kvlt.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * App
 *
 * @author KVLT
 * @date 2017-12-20.
 */
@SpringBootApplication
@MapperScan("com.kvlt.boot.mapper")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}