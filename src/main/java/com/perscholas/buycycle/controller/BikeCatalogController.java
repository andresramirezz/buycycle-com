package com.perscholas.buycycle.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.perscholas.buycycle.model.BikeCatalog;
import com.perscholas.buycycle.service.BikeCatalogService;

@Controller
public class BikeCatalogController {
	
	
	@Autowired
	private BikeCatalogService bikeCatalogService;

	@RequestMapping ( value = "/addBike", method=RequestMethod.GET )
	public String addBike ( Model model ) {
		BikeCatalog bc = new BikeCatalog();
		model.addAttribute("bike_catalog", bc);
		return "addBike";
	}

	@RequestMapping ( value = "/addBike", method=RequestMethod.POST )
	public String addBikePost 
		(@ModelAttribute ("bike_catalog") BikeCatalog bc, HttpServletRequest request) {
		bikeCatalogService.save (bc);
		
		MultipartFile bikeImage = bc.getBikeImage();
		
				try {
					byte[] bytes = bikeImage.getBytes();
					String name = bc.getId()+".png";
					BufferedOutputStream stream = new BufferedOutputStream 
						(new FileOutputStream("src/main/resources/static/img/bike/"+name));
					stream.write(bytes);
					stream.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		
		return "redirect:bikeList";
	}

	@RequestMapping ( "/bikeList" )
	public String bikeList ( Model model ) {
//		List<BikeCatalog> = bikeCatalogService.findAll();
		
		return "bikeList";
	}
	
	
}







