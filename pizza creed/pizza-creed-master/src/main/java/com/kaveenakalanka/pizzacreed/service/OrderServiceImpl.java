package com.kaveenakalanka.pizzacreed.service;

import com.kaveenakalanka.pizzacreed.dao.Order;
import com.kaveenakalanka.pizzacreed.dao.ShoppingBasket;
import com.kaveenakalanka.pizzacreed.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Transactional
    public Order checkout(ShoppingBasket shoppingBasket) {
        //TODO: Implement this method
        return null;
    }
}
