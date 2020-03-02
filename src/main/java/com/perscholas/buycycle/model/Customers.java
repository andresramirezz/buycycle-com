/**
 * @author Andres Ramirez
 * File: Customers.java
 * Date 02/29/2020
 * 
 */


package com.perscholas.buycycle.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table( name = "customers" )
public class Customers implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column( name = "id_customers")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id_customers;
	
	@Column( name = "cus_first_name")
	private String cus_first_name;
	
	@Column( name = "cus_last_name")
	private String cus_last_name;
	
	@Column( name = "cus_email")
	private String cus_email;
	
	@Column( name = "cus_street")
	private String cus_street;
	
	@Column( name = "cus_city")
	private String cus_city;
	
	@Column( name = "cus_state")
	private String cus_state;
	
	@Column( name = "cus_postal_code")
	private String cus_postal_code;
	
	@Column( name = "cus_phone")
	private String cus_phone;
	
	@OneToMany( mappedBy = "customers" )
	private Set<Orders> orders;
	
	/**
	 * @param cus_first_name
	 * @param cus_last_name
	 * @param cus_email
	 * @param cus_street
	 * @param cus_city
	 * @param cus_state
	 * @param cus_postal_code
	 * @param cus_phone
	 */
	public Customers(String cus_first_name, String cus_last_name, String cus_email, String cus_street, String cus_city,
			String cus_state, String cus_postal_code, String cus_phone) {
		super();
		this.cus_first_name = cus_first_name;
		this.cus_last_name = cus_last_name;
		this.cus_email = cus_email;
		this.cus_street = cus_street;
		this.cus_city = cus_city;
		this.cus_state = cus_state;
		this.cus_postal_code = cus_postal_code;
		this.cus_phone = cus_phone;
	}

	/**
	 * 
	 */
	public Customers() {
		super();
	}

	/**
	 * @return the id_customers
	 */
	public int getId_customers() {
		return id_customers;
	}

	/**
	 * @param id_customers the id_customers to set
	 */
	public void setId_customers(int id_customers) {
		this.id_customers = id_customers;
	}

	/**
	 * @return the cus_first_name
	 */
	public String getCus_first_name() {
		return cus_first_name;
	}

	/**
	 * @param cus_first_name the cus_first_name to set
	 */
	public void setCus_first_name(String cus_first_name) {
		this.cus_first_name = cus_first_name;
	}

	/**
	 * @return the cus_last_name
	 */
	public String getCus_last_name() {
		return cus_last_name;
	}

	/**
	 * @param cus_last_name the cus_last_name to set
	 */
	public void setCus_last_name(String cus_last_name) {
		this.cus_last_name = cus_last_name;
	}

	/**
	 * @return the cus_email
	 */
	public String getCus_email() {
		return cus_email;
	}

	/**
	 * @param cus_email the cus_email to set
	 */
	public void setCus_email(String cus_email) {
		this.cus_email = cus_email;
	}

	/**
	 * @return the cus_street
	 */
	public String getCus_street() {
		return cus_street;
	}

	/**
	 * @param cus_street the cus_street to set
	 */
	public void setCus_street(String cus_street) {
		this.cus_street = cus_street;
	}

	/**
	 * @return the cus_city
	 */
	public String getCus_city() {
		return cus_city;
	}

	/**
	 * @param cus_city the cus_city to set
	 */
	public void setCus_city(String cus_city) {
		this.cus_city = cus_city;
	}

	/**
	 * @return the cus_state
	 */
	public String getCus_state() {
		return cus_state;
	}

	/**
	 * @param cus_state the cus_state to set
	 */
	public void setCus_state(String cus_state) {
		this.cus_state = cus_state;
	}

	/**
	 * @return the cus_postal_code
	 */
	public String getCus_postal_code() {
		return cus_postal_code;
	}

	/**
	 * @param cus_postal_code the cus_postal_code to set
	 */
	public void setCus_postal_code(String cus_postal_code) {
		this.cus_postal_code = cus_postal_code;
	}

	/**
	 * @return the cus_phone
	 */
	public String getCus_phone() {
		return cus_phone;
	}

	/**
	 * @param cus_phone the cus_phone to set
	 */
	public void setCus_phone(String cus_phone) {
		this.cus_phone = cus_phone;
	}
}
