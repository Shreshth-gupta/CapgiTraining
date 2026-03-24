package com.example.orders.exception;

import com.example.orders.entity.OrderEntity;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(){
        super();
    }
}
