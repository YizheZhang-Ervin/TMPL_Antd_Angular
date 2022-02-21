package com.ervin.serviceconsumer.controller;

import com.ervin.serviceconsumer.pojo.Order;
import com.ervin.serviceconsumer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

   @Autowired
   private OrderService orderService;

    @GetMapping("{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId) throws Exception {
        // 根据id查询订单并返回
        return orderService.queryOrderById(orderId);
    }
}
