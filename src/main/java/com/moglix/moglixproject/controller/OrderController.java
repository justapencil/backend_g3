package com.moglix.moglixproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moglix.moglixproject.dto.Order;
import com.moglix.moglixproject.service.OrderSevice;

@RestController
@RequestMapping("/api")
public class OrderController {
	
   @Autowired
   OrderSevice orderSevice;
   
   @GetMapping("/index")
   public String sayhello()
   {
	   return "Main heading";
   }
   
   @PostMapping("/order/add")
   public Order addOrder(@RequestBody Order order)
   {
	   return orderSevice.addorder(order);
   }

	
}
