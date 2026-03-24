package com.example.orders.controller;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.dto.OrderResponseDTO;
import com.example.orders.entity.OrderEntity;
import com.example.orders.mapper.OrderMapper;
import com.example.orders.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.http.*;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")

public class OrderController {
    private OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<OrderResponseDTO> create(@Valid @RequestBody OrderRequestDTO request) {
        OrderEntity op=service.createOrder(request);
        OrderResponseDTO opr=OrderMapper.toResponseDTO(op);
        return new ResponseEntity<>(opr,HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponseDTO> getById(@PathVariable Long id) {
        OrderEntity op=service.getOrderById(id);
        OrderResponseDTO opr=OrderMapper.toResponseDTO(op);
        return new ResponseEntity<>(opr,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        service.deleteOrder(id);
    	return new ResponseEntity<>("Order deleted successfully",HttpStatus.OK);
    }
}
