package com.vj.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    @Autowired
    private Ssd ssd;

    public Laptop() {
        System.out.println("Laptop Constructor Called...");
    }

    @Override
    public void startUp() {
        ssd.runSsd();
        System.out.println("Laptop Startup");
    }
}