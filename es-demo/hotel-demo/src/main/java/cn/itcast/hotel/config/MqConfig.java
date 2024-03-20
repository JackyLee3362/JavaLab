package cn.itcast.hotel.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static cn.itcast.hotel.constants.MqConstants.*;

@Configuration
public class MqConfig {
    @Bean
    public Exchange topicExchange(){
        return new TopicExchange(HOTEL_EXCHANGE, true, false);
    }
    @Bean
    public Queue hotelInsertQueue(){
        return new Queue(HOTEL_INSERT_QUEUE, true);
    }

    @Bean
    public Queue hotelDeleteQueue(){
        return new Queue(HOTEL_DELETE_QUEUE, true);
    }

    @Bean
    public Binding insertQueueBinding(){
        return BindingBuilder
                .bind(hotelInsertQueue())
                .to(topicExchange())
                .with(HOTEL_INSERT_KEY)
                .noargs()
                ;
    }

    @Bean
    public Binding deleteQueueBinding(){
        return BindingBuilder
                .bind(hotelDeleteQueue())
                .to(topicExchange())
                .with(HOTEL_DELETE_KEY)
                .noargs()
                ;
    }
}
