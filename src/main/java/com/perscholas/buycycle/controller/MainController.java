/**
 * 
 */
package com.perscholas.buycycle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Andres Ramirez
 *
 */

@Controller
public class MainController {
	
	@GetMapping({"/","/login"})
	public String index() {
		return "index";
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
	
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
//	@GetMapping("/addBike")
//	public String addBike() {
//		return "addBike";
//	}
	
	
}
