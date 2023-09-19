package com.example.demo.services;

import com.example.demo.apiRepository.CustomerRepository;
import com.example.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServices {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    public List<Customer> getCustomers(){
        return customerRepository.getAllCustomer();
    }
    public Customer getCustomerById(int id){
        return customerRepository.findById(id);
    }
    public String deleteCustomer(int id){
        return customerRepository.delete(id);
    }
    public Customer updateCustomer(Customer customer){
        return customerRepository.update(customer);
    }
}

