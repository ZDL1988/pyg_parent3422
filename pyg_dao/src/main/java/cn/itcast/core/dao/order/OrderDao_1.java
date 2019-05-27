package cn.itcast.core.dao.order;

import cn.itcast.core.pojo.order.Order;

import java.util.List;

public interface OrderDao_1 {
    int updateStatus(Long id);
    List<Order> selectSellerOrder();

}