package com.moglix.moglixproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moglix.moglixproject.dto.Catalog;
import com.moglix.moglixproject.service.CatalogService;

@RestController
@RequestMapping("/api")
public class CatalogController {
	
	@Autowired
	CatalogService catalogService;
	
	@PostMapping("/catalog/add")
	public Catalog addCatalog(@RequestBody Catalog catalog)
	{
		return catalogService.addCatalog(catalog);
	}
	
	@GetMapping("/catalog/get")
	public List<Catalog> getCatalog()
	{
		return catalogService.getCatalogs();
	}
	
	@GetMapping("/catalog/getById")
	public Optional<Catalog> getCatalogById(@RequestParam("id") long id)
	{
		return catalogService.getCatalogById(id);
	}
}
