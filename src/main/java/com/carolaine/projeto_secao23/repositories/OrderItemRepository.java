package com.carolaine.projeto_secao23.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carolaine.projeto_secao23.entities.OrderItem;
import com.carolaine.projeto_secao23.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}