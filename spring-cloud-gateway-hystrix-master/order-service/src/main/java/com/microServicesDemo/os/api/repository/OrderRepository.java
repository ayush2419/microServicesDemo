package com.microServicesDemo.os.api.repository;

import com.microServicesDemo.os.api.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
