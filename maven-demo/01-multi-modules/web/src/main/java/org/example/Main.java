package org.example;

import org.example.entity.User;
import org.example.utils.Utils;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().name("jacky").age(24).height(1.75).weight(80.0).build();
        System.out.println("bmi是：" + Utils.calculateBmi(user.getHeight(), user.getWeight()));
    }

}