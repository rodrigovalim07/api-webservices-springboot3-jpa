package com.empresa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.curso.entities.OrderItem;
import com.empresa.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
