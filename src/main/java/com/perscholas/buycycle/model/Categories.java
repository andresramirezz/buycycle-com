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
@Table( name = "categories" )
public class Categories implements Serializable {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column( name = "id_categories")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id_categories;
	
	@Column( name = "category_name")
	private String category_name;
	
	@Column( name = "cat_description")
	private String cat_description;
	
	@OneToMany( mappedBy = "categories")
	private Set<Bicycles> bicycles;
	
	/**
	 * @param category_name
	 * @param cat_description
	 */
	public Categories(String category_name, String cat_description) {
		super();
		this.category_name = category_name;
		this.cat_description = cat_description;
	}

	/**
	 * 
	 */
	public Categories() {
		super();
	}

	/**
	 * @return the id_categories
	 */
	public Long getId_categories() {
		return id_categories;
	}

	/**
	 * @param id_categories the id_categories to set
	 */
	public void setId_categories(Long id_categories) {
		this.id_categories = id_categories;
	}

	/**
	 * @return the category_name
	 */
	public String getCategory_name() {
		return category_name;
	}

	/**
	 * @param category_name the category_name to set
	 */
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	/**
	 * @return the cat_description
	 */
	public String getCat_description() {
		return cat_description;
	}

	/**
	 * @param cat_description the cat_description to set
	 */
	public void setCat_description(String cat_description) {
		this.cat_description = cat_description;
	}
	
	
}
