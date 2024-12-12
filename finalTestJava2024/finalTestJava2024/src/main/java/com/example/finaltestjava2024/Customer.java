package com.example.finaltestjava2024;

// Andrew Murgan - 200589802
public class Customer {

    public Customer[] Customers;
    private int id;
    private String first;
    private String last;
    private String company;
    private String created_at;
    private String country;

    public Customer(int id, String first, String last, String company, String created_at, String country) {
        this.id = id;
        this.first = first;
        this.last = last;
        this.company = company;
        this.created_at = created_at;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Customer[] getCustomers() {
        return Customers;
    }

    public void setCustomers(Customer[] customers) {
        Customers = customers;
    }
}
