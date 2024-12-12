package com.example.finaltestjava2024;

import java.util.List;

// Andrew Murgan - 200589802
public class ApiResponse {
    private String company;
    private List<Customer> customer;

    public ApiResponse(String company, List<Customer> customer) {
        this.company = company;
        this.customer = customer;
    }

    public String getCompany() {
        return company;
    }

    public List<Customer> getCustomer() {
        return customer;
    }
}
