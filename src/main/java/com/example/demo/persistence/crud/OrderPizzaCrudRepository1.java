package com.example.demo.persistence.crud;

import com.example.demo.persistence.entity.OrderPizza;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface OrderPizzaCrudRepository1 extends CrudRepository<OrderPizza, Integer> {
    
    List<OrderPizza> findByIdCustomerOrderByDateAsc(int idCustomer); // Ordenar por fecha ascendente
}