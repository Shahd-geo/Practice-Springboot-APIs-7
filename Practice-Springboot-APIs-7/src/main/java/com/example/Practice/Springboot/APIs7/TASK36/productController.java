package com.example.Practice.Springboot.APIs7.TASK36;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {
    @DeleteMapping("/products/{id}")
}
