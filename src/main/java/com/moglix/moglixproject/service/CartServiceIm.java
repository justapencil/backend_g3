package com.moglix.moglixproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moglix.moglixproject.dto.Cart;
import com.moglix.moglixproject.repository.CartDAO;

@Service
public class CartServiceIm implements CartService {

	@Autowired
	CartDAO cartDao;
	@Override
	public String addCart(Cart cart) {
		// TODO Auto-generated method stub
		Cart c1 = cartDao.save(cart);
		if(c1!=null)
		{
			return "Cart Successfully Added";
		}
		return "Failed";
	}

	@Override
	public String updateCartbyId(Cart cart, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCartbyId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAllCart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart getCartById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cart> getCarts() {
		// TODO Auto-generated method stub
		return null;
	}

}
