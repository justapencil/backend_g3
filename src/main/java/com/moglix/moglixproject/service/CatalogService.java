package com.moglix.moglixproject.service;

import java.util.List;
import java.util.Optional;

import com.moglix.moglixproject.dto.Catalog;

public interface CatalogService {
	public List<Catalog> getCatalogs();
	public Catalog addCatalog(Catalog catalog);
	public Optional<Catalog> getCatalogById(long id);
}
