package com.example.demo.apiController;

import com.example.demo.apiRepository.CustomerRepository;
import com.example.demo.services.ApiServices;
import com.example.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @Autowired
    private ApiServices apiServices;
    private CustomerRepository customerRepository;

    @PostMapping
    public Customer addNewCustomer(@RequestBody Customer newCustomer){
        return apiServices.saveCustomer(newCustomer);
    }
    @GetMapping
    public List<Customer> getAllCustomers(){
        return apiServices.getCustomers();
    }

    @GetMapping("{id}")
    public Customer getCustomer(@PathVariable int id) {
        return apiServices.getCustomerById(id);
    }

    @PutMapping
    public Customer update(@RequestBody Customer updateCustomer) {
        return apiServices.updateCustomer(updateCustomer);
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable("id") Integer id){
        return apiServices.deleteCustomer(id);
    }

}
