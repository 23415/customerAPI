package com.example.demo.apiRepository;

import com.example.demo.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

@Repository
public class CustomerRepository {
    private List<Customer> list = new ArrayList<Customer>();

    public void createCustomer() {
        list = List.of(
                new Customer(1,"sukrit","skj@mail.com"),
                new Customer(2,"sukrit","skj@mail.com"),
                new Customer(3,"sukrit","skj@mail.com")
        );
    }

    public List<Customer> getAllCustomer() {
        return list.size()==0 ? new ArrayList<>() : list;
    }
    public Customer findById(int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == (id)) {
                return list.get(i);
            }
        }
        return null;
    }
    public List<Customer> search(String name) {
        return list.stream().filter(x -> x.getName().startsWith(name)).collect(Collectors.toList());
    }

    public Customer save(Customer p) {
        Customer customer = new Customer();
        customer.setId(p.getId());
        customer.setName(p.getName());
        customer.setEmail(p.getEmail());
        list.add(customer);
        return customer;
    }

    public String delete(Integer id) {
        list.removeIf(x -> x.getId() == (id));
        return null;
    }

    public Customer update(Customer customer) {
        int idx = 0;
        int id = customer.getId();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == (customer.getId())) {
                id = customer.getId();
                idx = i;
                break;
            }
        }
        Customer customer1 = new Customer();
        customer1.setId(id);
        customer1.setName(customer.getName());
        list.set(idx, customer);
        return customer;
    }

}
