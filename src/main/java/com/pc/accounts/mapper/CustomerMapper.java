package com.pc.accounts.mapper;

import com.pc.accounts.dto.CustomerDto;
import com.pc.accounts.entity.Customer;

public class CustomerMapper {

    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
     return CustomerDto.builder()
      .name(customerDto.getName())
      .email(customer.getEmail())
      .mobileNumber(customer.getMobileNumber())
      .build();
    }

    public static  Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
       return Customer.builder()
    		   .name(customerDto.getName())
    		   .email(customerDto.getEmail())
    		   .mobileNumber(customerDto.getMobileNumber())
    		   .build();
        
    }

}