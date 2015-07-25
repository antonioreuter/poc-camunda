package com.poc.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by antonioreuter on 7/24/15.
 */

@ComponentScan("com.poc")
@EntityScan(basePackages = "com.poc.customerservice.models")
@EnableJpaRepositories(basePackages = "com.poc.customerservice.repositories")
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
