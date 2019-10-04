package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfig  {
    @Bean
    public Actor srk(){
        Actor actor=new Actor("Shahrukh Khan","Male",54);
        return actor;
    }


    @Bean
    public Movie movieBean(){
        return new Movie();
    }
}
