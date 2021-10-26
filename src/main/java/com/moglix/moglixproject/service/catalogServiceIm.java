package com.moglix.moglixproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moglix.moglixproject.dto.Catalog;
import com.moglix.moglixproject.repository.CatalogDAO;

@Service
public class catalogServiceIm implements CatalogService {

	@Autowired
	CatalogDAO catalogDAO;
	@Override
	public List<Catalog> getCatalogs() {
		// TODO Auto-generated method stub
		return catalogDAO.findAll();
	}
	@Override
	public Catalog addCatalog(Catalog catalog) {
		// TODO Auto-generated method stub
		return catalogDAO.save(catalog);
	}
	@Override
	public Optional<Catalog> getCatalogById(long id) {
		// TODO Auto-generated method stub
		return catalogDAO.findById(id);
	}

}
