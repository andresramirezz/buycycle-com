package com.perscholas.buycycle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.perscholas.buycycle.model.BikeCatalog;

@Controller
public class BikeCatalogController {

	@RequestMapping ( "/addBike" )
	public String addBike ( Model model ) {
		BikeCatalog bc = new BikeCatalog();
		model.addAttribute("bike_catalog", bc);
		return "addBike";
	}
		
}
