package com.neuedu.mapper;

import com.neuedu.entity.OrderDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDetailMapper {
    List<OrderDetail> orderIdOrderDetail(String orderId);
    int orderIddeleteOrderDetail(String orderId);
    int orderIdupdateOrderDetail(OrderDetail detail);
    int detailIdupdateOrderDetail(OrderDetail detail);
    int insertOrderDetail(OrderDetail orderDetail);
}
