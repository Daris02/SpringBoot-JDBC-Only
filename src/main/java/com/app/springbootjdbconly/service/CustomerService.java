package com.app.springbootjdbconly.service;

import com.app.springbootjdbconly.model.Customer;
import com.app.springbootjdbconly.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
    CustomerRepository repository;

    public List<Customer> findAll() {
        return repository.findAll();
    }

    public Customer findById(String id) {
        return repository.getById(id);
    }

    public Customer save(Customer customer) {
        return repository.save(customer);
    }
}
