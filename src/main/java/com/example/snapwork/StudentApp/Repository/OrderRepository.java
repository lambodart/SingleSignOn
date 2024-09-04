package com.example.snapwork.StudentApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.snapwork.StudentApp.Bean.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
