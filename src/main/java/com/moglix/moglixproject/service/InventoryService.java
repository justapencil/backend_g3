package com.moglix.moglixproject.service;

import java.util.List;

import com.moglix.moglixproject.dto.Inventory;

public interface InventoryService {
	
	public Inventory addInventory(Inventory inventory);
	public List<Inventory> getInventory();

}
