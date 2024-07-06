package com.vj.boot.service;

import com.vj.boot.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop(Laptop laptop) {
        System.out.println("Laptop Service Called....");
        laptop.startUp();
        System.out.println();
    }
}
