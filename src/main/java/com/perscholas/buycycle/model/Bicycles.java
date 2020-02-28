/**
 * 
 */
package com.perscholas.buycycle.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Andres Ramirez
 *
 */

@Entity
@Table( name = "bicycles" )
public class Bicycles implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	@Id
	@Column( name = "id_bicycle")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id_bicycle;
	
	@Column( name = "bic_name")
	private String bic_name;
	
	@Column( name = "bic_description")
	private String bic_description;
	
	@Column( name = "bic_in_stock")
	private int bic_in_stock;
	
	@Column( name = "bic_price")
	private double bic_price;
	
	@Column( name = "bic_story")
	private String bic_story;
	
	@Column( name = "bic_picture")
	private String bic_picture;
	
	@ManyToOne( fetch = FetchType.EAGER )
	@JoinColumn( name = "supplier_id")
	private Suppliers suppliers;
	
	@ManyToOne( fetch = FetchType.EAGER )
	@JoinColumn( name = "category_id")
	private Categories categories;
	
	@OneToMany( mappedBy = "bicycles")
	@JsonIgnore
	private Set<OrderDetails> orderDetails;
	
	

	/**
	 * @param bic_name
	 * @param bic_description
	 * @param bic_in_stock
	 * @param bic_price
	 * @param bic_story
	 * @param bic_picture
	 */
	
	/** public Bicycles(String bic_name, String bic_description, int bic_in_stock, double bic_price, String bic_story,
			String bic_picture) {
		super();
		this.bic_name = bic_name;
		this.bic_description = bic_description;
		this.bic_in_stock = bic_in_stock;
		this.bic_price = bic_price;
		this.bic_story = bic_story;
		this.bic_picture = bic_picture;
	}*/

	
	
	/**
	 * 
	 */
	public Bicycles() {
		super();
	}

	/**
	 * @param bic_name
	 * @param bic_description
	 * @param bic_in_stock
	 * @param bic_price
	 * @param bic_story
	 * @param bic_picture
	 * @param suppliers
	 * @param categories
	 * @param orderDetails
	 */
	public Bicycles(String bic_name, String bic_description, int bic_in_stock, double bic_price, String bic_story,
			String bic_picture, Suppliers suppliers, Categories categories, Set<OrderDetails> orderDetails) {
		super();
		this.bic_name = bic_name;
		this.bic_description = bic_description;
		this.bic_in_stock = bic_in_stock;
		this.bic_price = bic_price;
		this.bic_story = bic_story;
		this.bic_picture = bic_picture;
		this.suppliers = suppliers;
		this.categories = categories;
		this.orderDetails = orderDetails;
	}

	/**
	 * @return the id_bicycle
	 */
	public int getId_bicycle() {
		return id_bicycle;
	}

	/**
	 * @param id_bicycle the id_bicycle to set
	 */
	public void setId_bicycle(int id_bicycle) {
		this.id_bicycle = id_bicycle;
	}

	/**
	 * @return the bic_name
	 */
	public String getBic_name() {
		return bic_name;
	}

	/**
	 * @param bic_name the bic_name to set
	 */
	public void setBic_name(String bic_name) {
		this.bic_name = bic_name;
	}

	/**
	 * @return the bic_description
	 */
	public String getBic_description() {
		return bic_description;
	}

	/**
	 * @param bic_description the bic_description to set
	 */
	public void setBic_description(String bic_description) {
		this.bic_description = bic_description;
	}

	/**
	 * @return the bic_in_stock
	 */
	public int getBic_in_stock() {
		return bic_in_stock;
	}

	/**
	 * @param bic_in_stock the bic_in_stock to set
	 */
	public void setBic_in_stock(int bic_in_stock) {
		this.bic_in_stock = bic_in_stock;
	}

	/**
	 * @return the bic_price
	 */
	public Double getBic_price() {
		return bic_price;
	}

	/**
	 * @param bic_price the bic_price to set
	 */
	public void setBic_price(Double bic_price) {
		this.bic_price = bic_price;
	}

	/**
	 * @return the bic_story
	 */
	public String getBic_story() {
		return bic_story;
	}

	/**
	 * @param bic_story the bic_story to set
	 */
	public void setBic_story(String bic_story) {
		this.bic_story = bic_story;
	}

	/**
	 * @return the bic_picture
	 */
	public String getBic_picture() {
		return bic_picture;
	}

	/**
	 * @param bic_picture the bic_picture to set
	 */
	public void setBic_picture(String bic_picture) {
		this.bic_picture = bic_picture;
	}

	/**
	 * @return the suppliers
	 */
	public Suppliers getSuppliers() {
		return suppliers;
	}

	/**
	 * @param suppliers the suppliers to set
	 */
	public void setSuppliers(Suppliers suppliers) {
		this.suppliers = suppliers;
	}

	/**
	 * @return the categories
	 */
	public Categories getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	/**
	 * @return the orderDetails
	 */
	public Set<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	/**
	 * @param orderDetails the orderDetails to set
	 */
	public void setOrderDetails(Set<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	
			
}
