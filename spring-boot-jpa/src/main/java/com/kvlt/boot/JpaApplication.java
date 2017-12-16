package com.kvlt.boot;

import com.kvlt.boot.dao.CommentRepository;
import com.kvlt.boot.dao.support.CustomRepositoryFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * JpaApplication
 *  在配置类上配置 @EnableJpaRepositories，并指定 repositoryFactoryBeanClass，让自定义的 Repository 实现起效
 *
 *  不需要自定义 Repository 实现，则在 Spring Data JPA里无须添加 EnableJpaRepositories 注解，
 *  因为 @SpringBootApplication 注解已经开启了对 Spring Data JPA 的支持。
 * @author KVLT
 * @date 2017-12-17.
 */
@SpringBootApplication
@EnableCaching
@EnableJpaRepositories(repositoryFactoryBeanClass = CustomRepositoryFactoryBean.class)
public class JpaApplication {

    @Autowired
    CommentRepository commentRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

}
