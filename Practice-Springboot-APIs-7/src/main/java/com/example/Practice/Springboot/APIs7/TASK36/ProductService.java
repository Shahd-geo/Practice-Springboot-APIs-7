package com.example.Practice.Springboot.APIs7.TASK36;

import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class ProductService {
    private HashMap<Integer, Product> productMap=new HashMap<>();
    // Create a method to initialize sample data
    public void loadSampleProducts() {
        productMap.put(1, new Product(1, "Laptop", 500));
        productMap.put(2, new Product(2, "Phone", 300));
        productMap.put(3, new Product(3, "Tablet", 200));
    }
        public String deleteProductById(int productId) {

            if (!productMap.containsKey(productId)) {
                return "Product not found";
            }

            Product product = productMap.get(productId);
            productMap.remove(productId);

            return "Product Deleted Successfully\n" +
                    "Product ID: " + product.getProductId() + "\n" +
                    "Product Name: " + product.getProductName() + "\n" +
                    "Status: Removed from inventory";
        }
    }
