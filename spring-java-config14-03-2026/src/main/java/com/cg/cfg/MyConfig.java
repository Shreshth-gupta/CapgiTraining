package com.cg.cfg;

import com.cg.beans.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
    @Bean
    @Scope("prototype")
    public HelloWorld getBean(){
        HelloWorld hello=new HelloWorld();
        hello.setName("Shreshtha");
        return hello;
    }
}
