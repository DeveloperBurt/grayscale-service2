package com.burt.controller;

import com.burt.feign.GrayscaleService1Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/test")
public class TestController {

    @Autowired
    private GrayscaleService1Feign grayscaleService1Feign;

    @GetMapping("/msg")
    public String msg() {
        return " service2 msg method return msg";
    }

    @GetMapping("/msg1")
    public String msg1() {
        return grayscaleService1Feign.getService1Msg();
    }

}
