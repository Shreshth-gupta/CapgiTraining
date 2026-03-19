package com.cg.cfg;

import com.cg.beans.Address;
import com.cg.beans.Employee;
import com.cg.beans.HelloWorld;
import org.springframework.cglib.transform.impl.AddDelegateTransformer;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@ComponentScan("com.cg")
@PropertySource("classpath:data.properties")
public class MyConfig {
    @Bean
    @Scope("prototype")
    public HelloWorld getBean(){
        HelloWorld hello=new HelloWorld();
        hello.setName("Shreshtha");
        return hello;
    }
    @Bean
    public Employee getBean1(){
        return new Employee();
    }
    @Bean
    public Address getBean2(){
        return new Address();
    }
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfig() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
