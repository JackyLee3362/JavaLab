package org.example;

import org.junit.jupiter.api.*;

class CalculatorTest {
    // @AfterAll
    // @AfterEach
    // 同理
    // Disable 被注解后不参与测试
    // DisplayName 测试名称

    @BeforeAll
    public static void beforeAllTest() {
        System.out.println("所有测试前准备...");
    }

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("单个测试前准备...");
    }

    @Test
    @Disabled
    public void testAdd() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(3, calculator.add(1, 2));
        System.out.println("add测试通过");
    }

    @Test
    @DisplayName("减法")
    void minus() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(-1, calculator.minus(1, 2));
        System.out.println("minus测试通过");
    }

}