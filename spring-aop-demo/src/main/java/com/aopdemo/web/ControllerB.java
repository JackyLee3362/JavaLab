package com.aopdemo.web;

import com.aopdemo.anno.MyAnno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class ControllerB {
    @GetMapping("/hello")
    public String hello() {
        return "web, hello";
    }

    @MyAnno
    @GetMapping("/world")
    public String world() {
        return "web, world";
    }
}
