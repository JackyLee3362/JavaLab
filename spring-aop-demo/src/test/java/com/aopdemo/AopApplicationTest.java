package com.aopdemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AopApplicationTest {


    private String baseUrl;

    @LocalServerPort
    private int port;

    RestTemplate restTemplate;

    @BeforeEach
    void setUp() {
        baseUrl = "http://localhost:" + port;
        restTemplate = new RestTemplate();
    }

    @Test
    void testWebHello() {
        String url = baseUrl + "/web/hello";
        String res = restTemplate.getForObject(url, String.class);
        System.out.println(res);
    }

    @Test
    void testWebWorld() {
        String url = baseUrl + "/web/world";
        String res = restTemplate.getForObject(url, String.class);
        System.out.println(res);
    }

    @Test
    void testControllerHello() {
        String url = baseUrl + "/controller/hello";
        String res = restTemplate.getForObject(url, String.class);
        System.out.println(res);
    }

    @Test
    void testControllerWorld() {
        String url = baseUrl + "/controller/world";
        String res = restTemplate.getForObject(url, String.class);
        System.out.println(res);
    }

}
