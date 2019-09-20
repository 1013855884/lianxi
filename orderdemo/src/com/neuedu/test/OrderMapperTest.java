package com.neuedu.test;

import com.neuedu.VO.OrderVO;
import com.neuedu.entity.Order;
import com.neuedu.enumeration.OrderStatusEnum;
import com.neuedu.mapper.OrderMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;


public class OrderMapperTest {
    public static void main(String[] args) {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(OrderMapperTest.class.
                getClassLoader().getResourceAsStream("MyBatis.xml"));
        SqlSession sqlSession = factory.openSession(true);
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        /**
         * 查询所有订单
         */
//        for (Order order : orderMapper.allOrder()) {
//            System.out.println(order);
//        }
        /**
         * 根据用户id查询订单
         */
//        for (Order order : orderMapper.meberIdOrder("2")) {
//            System.out.println(order);
//        }
        /**
         * 增加订单
         */
//        String uuid =UUID.randomUUID().toString().replaceAll("-","");
//        int random = new Random().nextInt(899999)+100000;
//        String orderId = uuid + random;
//        Order order = new Order();
//        order.setOrderId(orderId);
//        order.setStatus(2);
//        order.setMeberId(1);
//        System.out.println(orderMapper.insertOrder(order));
        /**
         * 根据订单id和用户id修改订单
         */
        //订单id
//        Order order = new Order();
//        order.setStatus(3);
//        order.setOrderId("1111");
//        System.out.println(orderMapper.orderIdupdateOrder(order));
        //用户id
//        Order order = new Order();
//        order.setStatus(3);
//        order.setMeberId(2);
//        System.out.println(orderMapper.meberIdupdateOrder(order));

        /**
         * 删除订单(订单id)
         */
//        System.out.println(orderMapper.orderIddeleteOrder("2222"));
        /**
         * 删除订单(用户id)
         */
//        System.out.println(orderMapper.meberIddeleteOrder("2"));
        /**
         * 枚举类测试
         */
        //建立两个集合将OrderList中元素导入到OrderVOList中，用OrderStatusEnum对象替换出status
//        List<Order> orderList = orderMapper.allOrder();
//
//        List<OrderVO> orderVOList =  new ArrayList<>();
//        for (Order order : orderList) {
//            OrderVO orderVO = new OrderVO();
//            orderVO.setOrderId(order.getOrderId());
//            orderVO.setMeberId(order.getMeberId());
//            orderVO.setCreateTime(order.getCreateTime());
//            orderVO.setUpdateTime(order.getUpdateTime());
//            orderVO.setStatus(OrderStatusEnum.getOrderStatusEnum(order.getMeberId()));
//            orderVOList.add(orderVO);
//        }
//        for (OrderVO orderVO : orderVOList) {
//            System.out.println(orderVO);
//        }


    }
}
