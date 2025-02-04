package com.kaveenakalanka.pizzacreed.repository;

import com.kaveenakalanka.pizzacreed.dao.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}