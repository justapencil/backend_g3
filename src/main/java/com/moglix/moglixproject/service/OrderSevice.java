package com.moglix.moglixproject.service;

import java.util.List;

import com.moglix.moglixproject.dto.Order;

public interface OrderSevice {
	public Order addorder(Order order);
	public String updateOrderbyId(Order order, String id);
	public String deleteorderbyId(String id);
	public String deleteAllorder();
	public Order getOrderById(String id);
	public List<Order> getorders();
}
