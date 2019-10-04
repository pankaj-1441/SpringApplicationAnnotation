package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig  {
    @Bean
    public Actor srk(){
        Actor actor=new Actor("Shahrukh Khan","Male",54);
        return actor;
    }

    @Bean
    public Actor sallu(){
        Actor actor=new Actor("Salman Khan","Male",53);
        return actor;
    }

    @Bean
    public Actor alia(){
        Actor actor=new Actor("Alia Bhatt","Feale",26);
        return actor;
    }

    @Bean({"movie1","movie2"})
    @Scope("prototype")
    public Movie movieBean(){
        Movie movie=new Movie(srk());
        return movie;
    }
}
