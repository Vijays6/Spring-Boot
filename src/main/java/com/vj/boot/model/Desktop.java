package com.vj.boot.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    @Autowired
    Ssd ssd;

    public Desktop() {
        System.out.println("Desktop Constructor Called...");
    }

    public void startUp() {
        ssd.runSsd();
        System.out.println("Booting Desktop...");
    }
}
