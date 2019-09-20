package com.neuedu.mapper;

import com.neuedu.entity.Order;

import java.util.List;

public interface OrderMapper {
    List<Order> allOrder();
    List<Order> meberIdOrder(String meberId);
    int insertOrder(Order order);
    int orderIdupdateOrder(Order order);
    int meberIdupdateOrder(Order order);
    int orderIddeleteOrder(String orderId);
    int meberIddeleteOrder(String meberId);
}
