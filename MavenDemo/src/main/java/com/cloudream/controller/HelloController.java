package com.cloudream.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloudream.bean.Person;

@RequestMapping("/Hello")
@Controller
public class HelloController {
     
    @RequestMapping("/greeting")
    public @ResponseBody Person greeting(@RequestParam(value="name", defaultValue="World") String name) {
         return new Person("уехЩ",20);
    }
}