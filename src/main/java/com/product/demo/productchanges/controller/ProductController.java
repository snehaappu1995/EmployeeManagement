package com.product.demo.productchanges.controller;

import com.product.demo.productchanges.entity.Product;
import com.product.demo.productchanges.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Create
    @PostMapping("/createproduct")
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    // Read all
    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/getProducts")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    // Read by ID
    @GetMapping("/productbyid/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    // Update
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

     Delete
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }


}
