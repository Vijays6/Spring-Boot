package com.vj.boot.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private Computer computer;

//    @Autowired
//    public Employee(Computer computer) {
//        this.computer = computer;
//    }
    public Computer getComputer() {
        return computer;
    }
    @Autowired
    @Qualifier("desktop")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public void start() {
        computer.startUp();
    }
}
