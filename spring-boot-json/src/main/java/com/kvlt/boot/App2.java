package com.kvlt.boot;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.kvlt.boot.entity.Ent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

/**
 * App2
 *
 * @author KVLT
 * @date 2017-12-18.
 */
@SpringBootApplication
public class App2 {

    /**
     * 在这里我们使用@Bean注入  fastJsonHttpMessageConvert
     * @return
     */
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter4 = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        fastJsonHttpMessageConverter4.setFastJsonConfig(fastJsonConfig);
        HttpMessageConverter<?> converter = fastJsonHttpMessageConverter4;
        return new HttpMessageConverters(converter);
    }

    @GetMapping("/json2")
    public Ent json2() {
        Ent ent = new Ent();
        Double d = Math.random() * 100;
        ent.setId(d.intValue());
        ent.setName("Name_" + d.intValue());
        ent.setCreateTime(new Date());
        return ent;
    }

    public static void main(String[] args) {
        SpringApplication.run(App2.class, args);
    }

}
