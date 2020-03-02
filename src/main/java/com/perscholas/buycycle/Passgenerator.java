/**
 * @author Andres Ramirez
 * File: Passgenerator.java
 * Date 02/29/2020
 * 
 */

package com.perscholas.buycycle;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Passgenerator {

	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
        
	System.out.println(bCryptPasswordEncoder.encode("1234"));
	
	}
}
