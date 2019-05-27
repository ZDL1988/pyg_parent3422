package cn.itcast.core.pojo.entity;

import cn.itcast.core.pojo.order.Order;
//import cn.itcast.core.pojo.order.OrderDesc;
import cn.itcast.core.pojo.item.Item;

import java.io.Serializable;
import java.util.List;

/**
 * 自定义封装商品实体类
 *  包含商品对象, 商品详情对象, 库存集合对象
 */
public class OrderEntity implements Serializable {

    //订单对象
    private Order order;

//    //商品详情对象
//    private OrderDesc ordersDesc;
//
//    //库存集合对象
//    private List<Order> orderList;
//
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
//
//    public OrderDesc getGoodsDesc() {
//        return orderDesc;
//    }
//
//    public void setOrderDesc(OrderDesc orderDesc) {
//        this.orderDesc = orderDesc;
//    }
//
//    public List<Order> getOrderList() {
//        return orderList;
//    }
//
//    public void setItemList(List<Order> orderList) {
//        this.orderList = orderList;
//    }
}
