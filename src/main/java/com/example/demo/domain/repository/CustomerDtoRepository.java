package com.example.demo.domain.repository;

import com.example.demo.domain.dto.CustomerDto;
import java.util.*;

public interface CustomerDtoRepository {
    
    List<CustomerDto> getAll();

//    List<CustomerDto> getByOrderId(int idOrder);

    Optional<CustomerDto> getCustomerDto(int idCustomer);

    Boolean edit(CustomerDto customerDto);

    CustomerDto save(CustomerDto customerDto);

    void delete(int idCustomer);  
   
}
