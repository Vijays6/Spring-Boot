package com.vj.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Autowired
    Desktop desktop;

    public void start() {
        desktop.start();
    }
}
