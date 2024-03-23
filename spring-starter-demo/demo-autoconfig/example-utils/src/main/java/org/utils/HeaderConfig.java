package org.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeaderConfig {

    @Bean
    HeaderParser headerParser(){
        return new HeaderParser();
    }

    @Bean
    HeaderGenerator headerGenerator(){
        return new HeaderGenerator();
    }
}
