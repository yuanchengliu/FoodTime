package com.foottime.managementend.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class test {
    @GetMapping("/te")
    public String test1(){
        return "hello";
    }
}
