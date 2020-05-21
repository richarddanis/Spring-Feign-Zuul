package com.richard.danis.www.skeleton.controller;

import com.richard.danis.www.skeleton.repository.Customer;
import com.richard.danis.www.skeleton.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/all")
    public @ResponseBody
    Iterable<Customer> getAllCustomer() {
        return repository.findAll();
    }
}
