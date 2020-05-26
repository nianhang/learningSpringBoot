package com.sjtu.learningspringboot.config;

import com.sjtu.learningspringboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {



    @Bean
    public HelloService helloService02(){
        //System.out.println("给容器中添加主键");
        return new HelloService();
    }




}
