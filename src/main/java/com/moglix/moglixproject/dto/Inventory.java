package com.moglix.moglixproject.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inventoryTBL")
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long invId;
	public String userId;
	public String productId;
	public String productQty;
	public String productPrice;
	public long getInvId() {
		return invId;
	}
	public void setInvId(long invId) {
		this.invId = invId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductQty() {
		return productQty;
	}
	public void setProductQty(String productQty) {
		this.productQty = productQty;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
}
