package cn.itcast.core.service;

import cn.itcast.core.dao.order.OrderDao;
import cn.itcast.core.pojo.entity.PageResult;
import cn.itcast.core.pojo.order.Order;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;



@Service
public class AllOrderServiceImpl implements AllOrderService {

    @Autowired
    private OrderDao orderDao;


    @Override
    public void fh(Long[] ids) {
        for (int i = 0; i < ids.length; i++) {
            Order order = new Order();
            order.setOrderId(ids[i]);
            order.setStatus("4");
            orderDao.updateByPrimaryKeySelective(order);
        }
    }

    @Override
    public PageResult search(Integer pageNum, Integer pageSize, Order order) {

        PageHelper.startPage(pageNum, pageSize);
        Page<Order> page1 = (Page<Order>) orderDao.selectByExample(null);
        return new PageResult(page1.getTotal(), page1.getResult());
    }
}
