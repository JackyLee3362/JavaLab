package com.example.rest;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

class TestGetMethod {
    // https://juejin.cn/post/6844903656165212174
    // 测试前需要先启动服务

    @Test
    public void testHello1() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/hello?id=1";
        String res = restTemplate.getForObject(url, String.class);
        System.out.println(res);
    }


    @Test
    public void testHello2() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/hello?id={?}";
        String res = restTemplate.getForObject(url, String.class, 2);
        System.out.println(res);
    }

    @Test
    public void testHello3() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/hello?id={yourId}";
        Map<String, Object> params = new HashMap<>();
        params.put("yourId", 3);
        String res = restTemplate.getForObject(url, String.class, params);
        System.out.println(res);
    }

    // getForEntity 含有 http状态码 和 ResponseHeader
    @Test
    public void testHello4() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/hello?id=4";
        ResponseEntity<String> res = restTemplate.getForEntity(url, String.class, 4);
        System.out.println("状态码是："+res.getStatusCodeValue());
        System.out.println("状态码是："+res.getStatusCode());
        System.out.println("返回头是："+res.getHeaders());
        System.out.println("返回体是："+res.getBody());
    }

}
