package com.moglix.moglixproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moglix.moglixproject.dto.Inventory;
import com.moglix.moglixproject.service.InventoryService;

@RestController
@RequestMapping("/api")
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;
	
	@PostMapping("/inventory/add")
	public Inventory addInventory(@RequestBody Inventory inventory)
	{
		return inventoryService.addInventory(inventory);
	}
	@GetMapping("/inventory/get")
	public List<Inventory> getInventory()
	{
		return inventoryService.getInventory();
	}
}
