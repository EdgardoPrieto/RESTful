package com.example.demo.persistence.crud;

import com.example.demo.persistence.entity.Customer;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface CustomerCrudRepository extends CrudRepository<Customer, Integer>{
    
//    List<Customer> findByIdOrder(int idOrder);
//    List<Customer> findByIdPizza(int idPizza);
    
}
