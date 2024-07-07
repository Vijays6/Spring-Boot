package com.vj.boot.service;

import com.vj.boot.model.Laptop;
import com.vj.boot.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;
    public void addLaptop(Laptop laptop) {
        System.out.println("Laptop Service Called....");
        laptop.startUp();
        laptopRepository.save(laptop);
        System.out.println();
    }
}
