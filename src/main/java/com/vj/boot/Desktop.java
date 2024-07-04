package com.vj.boot;

import org.springframework.stereotype.Component;

@Component
public class Desktop {
    public Desktop(){
        System.out.println("Desktop Constructor Called...");
    }
public void start(){
    System.out.println("Booting Desktop...");
}
}
