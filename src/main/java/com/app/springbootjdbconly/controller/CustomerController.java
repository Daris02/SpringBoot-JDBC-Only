package com.app.springbootjdbconly.controller;

import com.app.springbootjdbconly.model.Customer;
import com.app.springbootjdbconly.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/customers")
public class CustomerController {
    CustomerService service;

    @GetMapping({"", "/"})
    public List<Customer> getAllCustomers() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") String id) {
        return service.findById(id);
    }

    @PostMapping({"", "/"})
    public Customer createCustomer(@RequestBody Customer customer) {
        return service.save(customer);
    }
}
