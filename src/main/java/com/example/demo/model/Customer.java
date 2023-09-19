package com.example.demo.model;

public class Customer {
    private Integer userId;
    private String userName;
    private String email;
    public Customer(Integer id,String name, String email){
        this.userId=id;
        this.email=email;
        this.userName=name;
    }
    public Customer(){}
    public Integer getId(){
        return userId;
    }
    public void setId(Integer userId){
        this.userId=userId;
    }
    public String getName(){
        return userName;
    }
    public void setName(String name){
        this.userName=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
