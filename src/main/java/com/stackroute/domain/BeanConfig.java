package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig  {
    @Bean
    public Actor getActor(){
        Actor actor=new Actor();
        actor.setName("Shahrukh Khan");
        actor.setGender("Male");
        actor.setAge(53);
        return actor;
    }

    @Bean
    public Movie getMovie(){
        Movie movie=new Movie();
        return movie;
    }
}
