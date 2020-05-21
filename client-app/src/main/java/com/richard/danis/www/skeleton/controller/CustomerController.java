package com.richard.danis.www.skeleton.controller;

import com.richard.danis.www.skeleton.client.CustomerFeignClient;
import com.richard.danis.www.skeleton.model.CustomerDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerFeignClient client;

    public CustomerController(CustomerFeignClient client) {
        this.client = client;
    }

    @GetMapping("/all")
    public Iterable<CustomerDTO> getCustomers() {
        return client.getAvailablePets();
    }

    @PostMapping
    public CustomerDTO saveCustomer() {
        return client.saveCustomer(new CustomerDTO("NEW", "SAVE", "test@gmail.com"));
    }
}
