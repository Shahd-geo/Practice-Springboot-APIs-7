package com.example.Practice.Springboot.APIs7.TASK36.controllers;

import com.example.Practice.Springboot.APIs7.TASK36.services.ProductService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {
    private ProductService productService;
    public productController(ProductService productService) {
        this.productService = productService;
    }


    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id) {

        return productService.deleteProductById(id);

    }
}
