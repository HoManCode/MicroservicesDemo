package com.hoomancode.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
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
