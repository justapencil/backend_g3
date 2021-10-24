package com.moglix.moglixproject.service;

import java.util.List;

import com.moglix.moglixproject.dto.Cart;

public interface CartService {

	public String addCart(Cart cart);
	public String updateCartbyId(Cart cart, String id);
	public String deleteCartbyId(String id);
	public String deleteAllCart();
	public Cart getCartById(String id);
	public List<Cart> getCarts();
}
