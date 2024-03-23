package org.example;

import com.example.UserBMI;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AutoConfigTest {
    @Autowired
    UserBMI userBMI;

    @Test
    public void testMyBmi(){
        userBMI.calculateBMI();
    }

}