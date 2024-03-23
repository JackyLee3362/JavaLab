package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.utils.EnableHeaderConfig;

// @ComponentScan({"org.example", "com.jacky"})
// @Import({TokenParser.class}) // 导入普通类
// @Import({HeaderConfig.class}) // 导入配置类
// @Import({MyImportSelector.class}) // 导入ImportSelector接口实现类
@EnableHeaderConfig
@SpringBootApplication
public class TestAutoconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestAutoconfigApplication.class, args);
    }

}
