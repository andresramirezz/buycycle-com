package com.perscholas.buycycle.service;

import java.util.List;

import com.perscholas.buycycle.model.BikeCatalog;

public interface BikeCatalogService {

	BikeCatalog save ( BikeCatalog bc);
	
	List<BikeCatalog> findAll();
	
}
