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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Andres Ramirez
 *
 */

@Entity
@Table( name = "supplier_type" )
public class SupplierType implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column( name = "id_sup_type")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id_sup_type;
	
	@Column( name = "sup_type_name")
	private String sup_type_name;
	
	@Column( name = "sup_type_location")
	private String sup_type_location;
	
	@OneToMany( mappedBy = "supplierType")
	private Set<Suppliers> suppliers;

	/**
	 * @param sup_type_name
	 * @param sup_type_location
	 */
	public SupplierType(String sup_type_name, String sup_type_location) {
		super();
		this.sup_type_name = sup_type_name;
		this.sup_type_location = sup_type_location;
	}

	/**
	 * 
	 */
	public SupplierType() {
		super();
	}

	/**
	 * @return the id_sup_type
	 */
	public Long getId_sup_type() {
		return id_sup_type;
	}

	/**
	 * @param id_sup_type the id_sup_type to set
	 */
	public void setId_sup_type(Long id_sup_type) {
		this.id_sup_type = id_sup_type;
	}

	/**
	 * @return the sup_type_name
	 */
	public String getSup_type_name() {
		return sup_type_name;
	}

	/**
	 * @param sup_type_name the sup_type_name to set
	 */
	public void setSup_type_name(String sup_type_name) {
		this.sup_type_name = sup_type_name;
	}

	/**
	 * @return the sup_type_location
	 */
	public String getSup_type_location() {
		return sup_type_location;
	}

	/**
	 * @param sup_type_location the sup_type_location to set
	 */
	public void setSup_type_location(String sup_type_location) {
		this.sup_type_location = sup_type_location;
	}
}
