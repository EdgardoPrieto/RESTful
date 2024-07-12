package com.example.demo.domain.dto;

import com.example.demo.persistence.entity.OrderPizza;
import java.time.LocalDate;
import java.util.List;

public class OrderPizzaDto {

    private int idOrderDto;

    private int idCustomerDto;

    private LocalDate dateDto;

    private Double totalDto;

    private String methodDto;

    private String additionalNotesDto;

    private List<OrderItemDto> itemsDto;
    
    private CustomerDto customerDto;

    public int getIdOrderDto() {
        return idOrderDto;
    }

    public void setIdOrderDto(int idOrderDto) {
        this.idOrderDto = idOrderDto;
    }

    public int getIdCustomerDto() {
        return idCustomerDto;
    }

    public void setIdCustomerDto(int idCustomerDto) {
        this.idCustomerDto = idCustomerDto;
    }

    public LocalDate getDateDto() {
        return dateDto;
    }

    public void setDateDto(LocalDate dateDto) {
        this.dateDto = dateDto;
    }

    public Double getTotalDto() {
        return totalDto;
    }

    public void setTotalDto(Double totalDto) {
        this.totalDto = totalDto;
    }

    public String getMethodDto() {
        return methodDto;
    }

    public void setMethodDto(String methodDto) {
        this.methodDto = methodDto;
    }

    public String getAdditionalNotesDto() {
        return additionalNotesDto;
    }

    public void setAdditionalNotesDto(String additionalNotesDto) {
        this.additionalNotesDto = additionalNotesDto;
    }

    public List<OrderItemDto> getItemsDto() {
        return itemsDto;
    }

    public void setItemsDto(List<OrderItemDto> itemsDto) {
        this.itemsDto = itemsDto;
    }

    public CustomerDto getCustomerDto() {
        return customerDto;
    }

    public void setCustomerDto(CustomerDto customerDto) {
        this.customerDto = customerDto;
    }



}
