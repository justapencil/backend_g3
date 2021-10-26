package com.moglix.moglixproject.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderTBL")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long orderId;
	
	public String userId;     
	public String  invid;     
	public String productId; 
	public String status;
	public int productQty; 
	public double totalPrice;
	public double grandtotalprice;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getOrderId() {
		return orderId;
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getInvid() {
		return invid;
	}
	public void setInvid(String invid) {
		this.invid = invid;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getProductQty() {
		return productQty;
	}
	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getGrandtotalprice() {
		return grandtotalprice;
	}
	public void setGrandtotalprice(double grandtotalprice) {
		this.grandtotalprice = grandtotalprice;
	}
		
		
	
}
