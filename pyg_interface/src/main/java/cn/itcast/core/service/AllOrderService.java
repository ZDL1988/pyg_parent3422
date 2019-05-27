package cn.itcast.core.service;

import cn.itcast.core.pojo.entity.BuyerCart;
import cn.itcast.core.pojo.entity.PageResult;
import cn.itcast.core.pojo.log.PayLog;
import cn.itcast.core.pojo.order.Order;

import java.util.List;

public interface AllOrderService {

    void fh(Long[] ids);

    PageResult search(Integer pageNum, Integer pageSize, Order order);
}
