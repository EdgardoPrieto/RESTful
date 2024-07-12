package com.example.demo.persistence.mapper;

import com.example.demo.domain.dto.OrderItemDto;
import com.example.demo.domain.dto.OrderPizzaDto;
import com.example.demo.persistence.entity.OrderItem;
import com.example.demo.persistence.entity.OrderPizza;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {PizzaMapper.class})
public interface OrderItemMapper {

    @Mappings({
        @Mapping(source = "idItem", target = "idItemDto"),
        @Mapping(source = "idOrder", target = "idOrderDto"),
        @Mapping(source = "idPizza", target = "idPizzaDto"),
        @Mapping(source = "quantity", target = "quantityDto"),
        @Mapping(source = "price", target = "priceDto")
    })
    OrderItemDto toOrderItemDto(OrderItem orderItem);

    List<OrderItemDto> toOrderItemDtos(List<OrderItem> orderItem);

    @InheritInverseConfiguration
    OrderItem toOrderItem(OrderItemDto orderItemDto);

    List<OrderItem> toOrderPizzas(List<OrderItemDto> orderItemDtos);

}
