package com.kvlt.boot;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.kvlt.boot.entity.Ent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * App
 *
 * @author KVLT
 * @date 2017-12-18.
 */
@SpringBootApplication
@RestController
public class App1 extends WebMvcConfigurerAdapter {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);

        /**
         * 1、需要先定义一个 convert 转换消息的对象
         * 2、添加 fastjson 的配置信息，比如：是否要格式化返回的 json 数据
         * 3、在 convert 中添加配置信息
         * 4、将 convert 添加到 converters 中
         */
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter4 = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        fastJsonHttpMessageConverter4.setFastJsonConfig(fastJsonConfig);
        converters.add(fastJsonHttpMessageConverter4);
    }

    @GetMapping("/json1")
    public Ent json() {
        Ent ent = new Ent();
        Double d = Math.random() * 100;
        ent.setId(d.intValue());
        ent.setName("Name_" + d.intValue());
        return ent;
    }

    public static void main(String[] args) {
        SpringApplication.run(App1.class, args);
    }

}
