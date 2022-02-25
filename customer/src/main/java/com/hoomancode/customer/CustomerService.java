package com.hoomancode.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {

        Customer customer=Customer.builder()
                .firstname(request.firstName())
                .lastNmae(request.lastName())
                .email(request.email())
                .build();
       //todo: check if email valid
       //todo check if email not taken
       customerRepository.save(customer);
    }
}
