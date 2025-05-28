package com.example.backendproductinventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.example.backendproductinventory",
        "com.example.backendproductinventory.productinventory.repository",
        "com.example.backendproductinventory.productinventory.service",
        "com.example.backendproductinventory.productinventory.controller",
        "com.example.backendproductinventory.productinventory.model"

})
public class BackendProductInventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendProductInventoryApplication.class, args);
    }

}
