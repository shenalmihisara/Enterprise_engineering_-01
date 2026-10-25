package org.example.Controller;

import org.example.model.Customer;
import org.example.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @GetMapping("/customer")
    List<Customer> getCustomer(){
        CustomerService service = new CustomerService();
        return service.getCustomer();
    }
}
