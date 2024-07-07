package com.vj.boot.repo;

import com.vj.boot.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop laptop){
        System.out.println("Saved From REPO");
    }
}
