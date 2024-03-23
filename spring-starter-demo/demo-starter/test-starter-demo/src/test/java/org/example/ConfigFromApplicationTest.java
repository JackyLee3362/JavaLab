package org.example;

import org.example.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @description: 测试下自动装配
 * @author: Jacky Lee
 * @date: 2024/3/23 10:24
 */
@SpringBootTest
public class ConfigFromApplicationTest {

    @Value("${com.jacky.user.name}")
    private String name;
    @Autowired
    Student student;
    @Test
    public void testConfiguration(){
        System.out.println(name);
        System.out.println(student);
    }
}
