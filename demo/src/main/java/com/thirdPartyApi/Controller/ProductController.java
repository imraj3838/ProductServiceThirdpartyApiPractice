package com.thirdPartyApi.Controller;

import com.thirdPartyApi.models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    // to get all product
    @GetMapping()
    public Product getAllProduct(){
        return new Product();
    }

    // to get single product
    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") long id){
        return new Product();
    }

    // to add new product
    @PostMapping
    public Product addNewProduct(@RequestBody Product product){
        Product prod = new Product();
        prod.setTitle("This is priyanshu raj");
        return prod;
    }

    // Update one data using map
    @PatchMapping("/{id}")
    public Product partialUpdateProduct(@PathVariable("id") long id, @RequestBody Product product){
        return new Product();
    }

    // replace all product data
    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") long id, @RequestBody Product product){
        return new Product();
    }

    // to delete one product
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") long id){
        return;
    }
}
