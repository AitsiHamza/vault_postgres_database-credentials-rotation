package com.virat.fetchdatabasesecrets.web;


import com.virat.fetchdatabasesecrets.entities.Product;
import com.virat.fetchdatabasesecrets.repos.ProductRepo;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class BookController {
    private ProductRepo bookRepo;

    @PostMapping("/save")
    public ResponseEntity<Product> save(){
        Product product = bookRepo.save(new Product(RandomStringUtils.random(6)));
        System.out.println(product);
        return new ResponseEntity<>(product,HttpStatus.ACCEPTED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAll(){
        return new ResponseEntity<>(bookRepo.findAll(),HttpStatus.ACCEPTED);

    }
}
