package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.utils.HeaderGenerator;
import org.utils.HeaderParser;
import org.utils.TokenParser;

@SpringBootTest
class TestAutoconfigApplicationTests {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testGetTokenParser() {
        // 获得 @Component 注解的对象
        TokenParser tokenParser = applicationContext.getBean(TokenParser.class);
        tokenParser.parse();
        System.out.println(applicationContext.getBean(TokenParser.class));
    }

    @Test
    void testGetHeaderParser(){
        // 获得 @Configuration 注解的对象
        System.out.println(applicationContext.getBean(HeaderParser.class));
    }

    @Test
    void testGetHeaderGenerator(){
        System.out.println(applicationContext.getBean(HeaderGenerator.class));
    }
}
