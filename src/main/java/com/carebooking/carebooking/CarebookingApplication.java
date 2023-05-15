package com.carebooking.carebooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class CarebookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarebookingApplication.class, args);
    }

}
