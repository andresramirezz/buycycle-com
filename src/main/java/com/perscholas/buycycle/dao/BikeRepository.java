package com.perscholas.buycycle.dao;

import org.springframework.data.repository.CrudRepository;

import com.perscholas.buycycle.model.BikeCatalog;

public interface BikeRepository extends CrudRepository<BikeCatalog, Long>{

}
