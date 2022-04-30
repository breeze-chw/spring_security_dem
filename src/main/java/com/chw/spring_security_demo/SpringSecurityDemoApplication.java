package com.chw.spring_security_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.chw.spring_security_demo.mapper")
public class SpringSecurityDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringSecurityDemoApplication.class, args);
        System.out.println(run);
        System.out.println(run);

    }

}
