package org.example.service;

import org.example.model.Customer;

import java.util.Arrays;
import java.util.List;

public class CustomerService {

    public List<Customer> getCustomer(){
//        Customer shenalCustomer = new Customer("Shenal","0771234567",30,true);
//        Customer chamathCustomer = new Customer("Chamath","0771234568",20,true);
//
//        List<Customer> customerList = new ArrayList();
//        customerList.add(shenalCustomer);
//        customerList.add(chamathCustomer);
//
//        return customerList;

        return Arrays.asList(
                new Customer("Shenal","0771234567",30,true),
                new Customer("Chamath","0771234569",20,true),
                new Customer("Sirimal","0771234568",20,true),
                new Customer("Nisal","0771234568",20,true),
                new Customer("Piyasena","0771234568",20,true)
        );
    }
}
