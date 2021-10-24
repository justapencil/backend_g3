package com.moglix.moglixproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moglix.moglixproject.dto.Order;
import com.moglix.moglixproject.repository.OrderDAO;

@Service
public class OrderServiceIm implements OrderSevice {

	@Autowired
	OrderDAO orderDao;
	@Override
	public Order addorder(Order order) {
		// TODO Auto-generated method stub
		Order o1 = orderDao.save(order);
			return o1;
	}

	@Override
	public String updateOrderbyId(Order order, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteorderbyId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAllorder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrderById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getorders() {
		// TODO Auto-generated method stub
		return null;
	}

}
