package com.moglix.moglixproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moglix.moglixproject.dto.Inventory;
import com.moglix.moglixproject.repository.InventoryDAO;
@Service
public class InventoryServiceIm implements InventoryService {

	@Autowired
	private InventoryDAO inventoryDAO;
	
	@Override
	public Inventory addInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		return inventoryDAO.save(inventory);
	}

	@Override
	public List<Inventory> getInventory() {
		// TODO Auto-generated method stub
		return inventoryDAO.findAll();
	}

}
