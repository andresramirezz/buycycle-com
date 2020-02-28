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

/**
 * @author Andres Ramirez
 *
 */

@Entity
@Table( name = "suppliers" )
public class Suppliers implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column( name = "id_suppliers")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id_suppliers;
	
	@Column( name = "sup_name")
	private String sup_name;
	
	@Column( name = "sup_contactName")
	private String sup_contactName;
	
	@Column( name = "sup_street")
	private String sup_street;
	
	@Column( name = "sup_city")
	private String sup_city;
	
	@Column( name = "sup_state")
	private String sup_state;
	
	@OneToMany( mappedBy = "suppliers")
	private Set<Bicycles> bicycles;
	
	@ManyToOne( fetch = FetchType.EAGER )
	@JoinColumn( name = "sup_type_id")
	private SupplierType supplierType;
	
	/**
	 * @param sup_name
	 * @param sup_contactName
	 * @param sup_street
	 * @param sup_city
	 * @param sup_state
	 * @param supplierType
	 */
	public Suppliers(String sup_name, String sup_contactName, String sup_street, String sup_city, String sup_state,
			SupplierType supplierType) {
		super();
		this.sup_name = sup_name;
		this.sup_contactName = sup_contactName;
		this.sup_street = sup_street;
		this.sup_city = sup_city;
		this.sup_state = sup_state;
		this.supplierType = supplierType;
	}

	/**
	 * 
	 */
	public Suppliers() {
		super();
	}

	/**
	 * @return the id_suppliers
	 */
	public Long getId_suppliers() {
		return id_suppliers;
	}

	/**
	 * @param id_suppliers the id_suppliers to set
	 */
	public void setId_suppliers(Long id_suppliers) {
		this.id_suppliers = id_suppliers;
	}

	/**
	 * @return the sup_name
	 */
	public String getSup_name() {
		return sup_name;
	}

	/**
	 * @param sup_name the sup_name to set
	 */
	public void setSup_name(String sup_name) {
		this.sup_name = sup_name;
	}

	/**
	 * @return the sup_contactName
	 */
	public String getSup_contactName() {
		return sup_contactName;
	}

	/**
	 * @param sup_contactName the sup_contactName to set
	 */
	public void setSup_contactName(String sup_contactName) {
		this.sup_contactName = sup_contactName;
	}

	/**
	 * @return the sup_street
	 */
	public String getSup_street() {
		return sup_street;
	}

	/**
	 * @param sup_street the sup_street to set
	 */
	public void setSup_street(String sup_street) {
		this.sup_street = sup_street;
	}

	/**
	 * @return the sup_city
	 */
	public String getSup_city() {
		return sup_city;
	}

	/**
	 * @param sup_city the sup_city to set
	 */
	public void setSup_city(String sup_city) {
		this.sup_city = sup_city;
	}

	/**
	 * @return the sup_state
	 */
	public String getSup_state() {
		return sup_state;
	}

	/**
	 * @param sup_state the sup_state to set
	 */
	public void setSup_state(String sup_state) {
		this.sup_state = sup_state;
	}

	/**
	 * @return the supplierType
	 */
	public SupplierType getSupplierType() {
		return supplierType;
	}

	/**
	 * @param supplierType the supplierType to set
	 */
	public void setSupplierType(SupplierType supplierType) {
		this.supplierType = supplierType;
	}

}
