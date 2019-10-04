package com.stackroute;

import com.stackroute.domain.BeanConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeCheck {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
        Movie movie1=context.getBean("movie1",Movie.class);
        Movie movie2=context.getBean("movie2",Movie.class);
        System.out.println(movie1==movie2);


    }
}
