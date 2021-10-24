package com.moglix.moglixproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.moglix.moglixproject.dto.Cart;
import com.moglix.moglixproject.dto.Order;
import com.moglix.moglixproject.service.CartService;
import com.moglix.moglixproject.service.OrderSevice;

@SpringBootApplication
public class MoglixPiyushApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(MoglixPiyushApplication.class, args);
//		ApplicationContext applicationContext = SpringApplication.run(MoglixPiyushApplication.class, args);
//		OrderSevice orderSevice = applicationContext.getBean(OrderSevice.class);
//		CartService cartService = applicationContext.getBean(CartService.class);
//		
//		String result1 = orderSevice.addorder(new Order("O_01", "U_01", "I_01", "P_01",200, 12110, 22220));
//		String result2 = cartService.addCart(new Cart("C_01", "O_01", "U_01", "I_01", "P_01", 200, 21211));
//		
//		System.out.println("|*******************-Cart-**********************|");
//		System.out.println("1.........AddCart");
//		System.out.println(result2);
//		System.out.println("|******************-END-Cart-**********************|");
//
//		System.out.println("|*******************-Order-**********************|");
//		System.out.println("1.........AddOrder");
//		System.out.println(result1);
//		System.out.println("|******************-END-Order-**********************|");
	}

}
