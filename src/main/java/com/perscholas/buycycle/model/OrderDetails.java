/**
 * @author Andres Ramirez
 * File: OrderDetails.java
 * Date 02/29/2020
 * 
 */


package com.perscholas.buycycle.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "orders_details" )
public class OrderDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column( name = "id_order_details")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id_order_details;
	
	@Column( name = "ord_det_price")
	private Double ord_det_price;
	
	@Column( name = "ord_det_quantity")
	private Long ord_det_quantity;
	
	@ManyToOne( fetch = FetchType.EAGER )
	@JoinColumn( name = "orders_id")
	private Orders orders;
	
	@ManyToOne( fetch = FetchType.EAGER )
	@JoinColumn( name = "bicycle_id")
	private Bicycles bicycles;
	

	/**
	 * @param ord_det_price
	 * @param ord_det_quantity
	 * @param orders
	 * @param bicycles
	 */
	public OrderDetails(Double ord_det_price, Long ord_det_quantity, Orders orders, Bicycles bicycles) {
		super();
		this.ord_det_price = ord_det_price;
		this.ord_det_quantity = ord_det_quantity;
		this.orders = orders;
		this.bicycles = bicycles;
	}

	/**
	 * 
	 */
	public OrderDetails() {
		super();
	}

	/**
	 * @return the id_order_details
	 */
	public Long getId_order_details() {
		return id_order_details;
	}

	/**
	 * @param id_order_details the id_order_details to set
	 */
	public void setId_order_details(Long id_order_details) {
		this.id_order_details = id_order_details;
	}

	/**
	 * @return the ord_det_price
	 */
	public Double getOrd_det_price() {
		return ord_det_price;
	}

	/**
	 * @param ord_det_price the ord_det_price to set
	 */
	public void setOrd_det_price(Double ord_det_price) {
		this.ord_det_price = ord_det_price;
	}

	/**
	 * @return the ord_det_quantity
	 */
	public Long getOrd_det_quantity() {
		return ord_det_quantity;
	}

	/**
	 * @param ord_det_quantity the ord_det_quantity to set
	 */
	public void setOrd_det_quantity(Long ord_det_quantity) {
		this.ord_det_quantity = ord_det_quantity;
	}

	/**
	 * @return the orders
	 */
	public Orders getOrders() {
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	/**
	 * @return the bicycles
	 */
	public Bicycles getBicycles() {
		return bicycles;
	}

	/**
	 * @param bicycles the bicycles to set
	 */
	public void setBicycles(Bicycles bicycles) {
		this.bicycles = bicycles;
	}
	
}