package com.vj.boot.springjdbc.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {
//    private static final int totalMarks=1200;
    private int rollNo;
    private String name;
    private int marks;
}
