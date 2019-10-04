package com.stackroute;

import com.stackroute.domain.BeanConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppContext {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
        Movie movie=context.getBean("getMovie",Movie.class);
        movie.getActorInfo();
    }
}
