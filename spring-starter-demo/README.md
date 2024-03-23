# Spring Starter 的制作

## 实验目的

- 理解 Spring 自动装配的原理
- 实现 Spring starter 完成自动配置
- 理解 Spring 中 @EnableConfigurationProperties 注解的用法

## 实验一

如何在测试文件中使用 applicationContext 获得 TokenParser 的 Bean 对象

如果不能获得，可以有哪些方法？

方案一：使用 @ComponentScan 注解

方案二：使用 @Import 导入

- 导入普通类
- 导入配置类
- 导入 ImportSelector 接口实现类

[测试代码](demo-autoconfig/test-autoconfig/src/test/java/org/example/TestAutoconfigApplicationTests.java)

## 实验二

如果自定义一个自动装配类，包括使用配置文件中的信息

@EnableConfigurationProperties 注解是将配置文件中的属性装配到 User 中，并交给 IOC 容器管理

[测试代码](demo-starter/test-starter-demo/src/test/java/org/example/AutoConfigTest.java)

## 来源

黑马程序员 java-web项目 Day14 SpringBoot原理 自动配置