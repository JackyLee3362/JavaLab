package com.aopdemo.controller;

import com.aopdemo.anno.MyAnno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class ControllerA {
    @GetMapping("/hello")
    public String hello() {
        return "controller, hello";
    }

    @MyAnno
    @GetMapping("/world")
    public String world() {
        return "controller, world";
    }
}
