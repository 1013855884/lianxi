package com.neuedu.test;

import com.neuedu.entity.OrderDetail;
import com.neuedu.mapper.OrderDetailMapper;
import com.neuedu.mapper.OrderMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class OrderDetailMapperTest {
    public static void main(String[] args) {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(OrderDetailMapperTest.class.
                getClassLoader().getResourceAsStream("MyBatis.xml"));
        SqlSession sqlSession = factory.openSession(true);
        OrderDetailMapper detailMapper =  sqlSession.getMapper(OrderDetailMapper.class);
        /**
         * 根据订单id查询所有详情
         */
//        for (OrderDetail detail : detailMapper.orderIdOrderDetail("1111")) {
//            System.out.println(detail);
//        }

        /**
         * 根据订单id删除所有详情
         */
//        System.out.println(detailMapper.orderIddeleteOrderDetail("1111"));
        /**
         * 根据订单id和详情id来修改
         */
        //根据订单id
//        OrderDetail orderDetail = new OrderDetail();
//        orderDetail.setCount(2);
//        orderDetail.setOrderId("1111");
//        System.out.println(detailMapper.orderIdupdateOrderDetail(orderDetail));
        //根据详情id
//        OrderDetail orderDetail = new OrderDetail();
//        orderDetail.setCount(3);
//        orderDetail.setDetailId("11");
//        System.out.println(detailMapper.detailIdupdateOrderDetail(orderDetail));
        /**
         * 增加订单详情
         */
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId("2222");
        orderDetail.setDetailId("22");
        orderDetail.setGoodsId(22);
        orderDetail.setCount(2);
        System.out.println(orderDetail.toString());
        System.out.println(detailMapper.insertOrderDetail(orderDetail));
    }
}
