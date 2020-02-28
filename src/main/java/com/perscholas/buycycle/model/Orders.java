/**
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Andres Ramirez
 *
 */

@Entity
@Table( name = "orders" )
public class Orders implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column( name = "id_orders")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id_orders;
	
	@Column( name = "ord_date")
	private String ord_date;
	
	@Column( name = "ord_description")
	private String ord_description;
	
	@ManyToOne( optional = true )
	@JoinColumn( name = "customer_id")
	private Customers customers;
	
	@OneToMany( mappedBy = "orders")
	private Set<OrderDetails> orderDetails;
	
	/**
	 * @param ord_date
	 * @param ord_description
	 * @param customers
	 */
	public Orders(String ord_date, String ord_description) {
		super();
		this.ord_date = ord_date;
		this.ord_description = ord_description;
	}

	/**
	 * 
	 */
	public Orders() {
		super();
	}

	/**
	 * @return the id_orders
	 */
	public Long getId_orders() {
		return id_orders;
	}

	/**
	 * @param id_orders the id_orders to set
	 */
	public void setId_orders(Long id_orders) {
		this.id_orders = id_orders;
	}

	/**
	 * @return the ord_date
	 */
	public String getOrd_date() {
		return ord_date;
	}

	/**
	 * @param ord_date the ord_date to set
	 */
	public void setOrd_date(String ord_date) {
		this.ord_date = ord_date;
	}

	/**
	 * @return the ord_description
	 */
	public String getOrd_description() {
		return ord_description;
	}

	/**
	 * @param ord_description the ord_description to set
	 */
	public void setOrd_description(String ord_description) {
		this.ord_description = ord_description;
	}

	/**
	 * @return the customers
	 */
	public Customers getCustomers() {
		return customers;
	}

	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

}
