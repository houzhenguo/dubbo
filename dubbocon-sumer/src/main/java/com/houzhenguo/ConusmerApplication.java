package com.houzhenguo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
public class ConusmerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConusmerApplication.class,args);
    }
}

