package com.moglix.moglixproject.service;

import java.util.List;

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

}
