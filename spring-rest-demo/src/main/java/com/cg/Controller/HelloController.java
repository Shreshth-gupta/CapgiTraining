package com.cg.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller     //logical view
public class HelloController {
    @GetMapping("abc/{name}")
    public String sayHello(@PathVariable String name){
        return "hello "+name;
    }
}
