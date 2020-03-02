/**
 * @author Andres Ramirez
 * File: BikeRepository.java
 * Date 02/29/2020
 * 
 */


package com.perscholas.buycycle.dao;

import org.springframework.data.repository.CrudRepository;

import com.perscholas.buycycle.model.BikeCatalog;

public interface BikeRepository extends CrudRepository<BikeCatalog, Long>{

}
