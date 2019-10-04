package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;


public class Movie {

    private Actor actor;

    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void getActorInfo() {
        System.out.println(actor.toString());
    }
}
