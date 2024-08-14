package com.Projects.SpringBoot.ConstraintViolationException.Controller;

import com.Projects.SpringBoot.ConstraintViolationException.Entity.Customer;
import com.Projects.SpringBoot.ConstraintViolationException.Repository.CustomerRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;
    @GetMapping("/test")
    public String test(){
        return "This Is a Test Run";
    }
    @PostMapping("/save")
    public String save(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "Data Saved";
    }
    @GetMapping("/all")
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
