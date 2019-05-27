package cn.itcast.core.controller;


import cn.itcast.core.pojo.entity.PageResult;
import cn.itcast.core.pojo.entity.Result;
import cn.itcast.core.pojo.order.Order;
import cn.itcast.core.service.AllOrderService;

import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/allorder")
public class AllOrderFhController {

    @Reference
    private AllOrderService orderService;

    //发货
    @RequestMapping("/fh")
    public Result fh(Long[] ids) {
        try {
            orderService.fh(ids);
            return new Result(true, "发货成功");
        } catch (Exception e) {
//            e.printStackTrace();
            return new Result(false, "发货失败");
        }
    }


    @RequestMapping("/search")
    public PageResult search(Integer pageNum, Integer pageSize, @RequestBody Order order) throws Exception {
        return orderService.search(pageNum, pageSize, order);
    }

}
