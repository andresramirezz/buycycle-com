/**
 * @author Andres Ramirez
 * File: BikeCatalog.java
 * Date 02/29/2020
 * 
 */


package com.perscholas.buycycle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;


@Entity
public class BikeCatalog {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private Long id;
	private String brand;
	private String owner;
	private String nickname;
	private String publicationDate;
	private String quality;
	private String category;
	private int numberOfMiles;
	private String format;
	private int registerNumber;
	private double shippingWeight;
	private double listPrice;
	private double ourPrice;
	private boolean active=true;
	
	@Column( columnDefinition="text" )
	private String description;
	private int inStockNumber;
	
	@Transient
	private MultipartFile bikeImage;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String title) {
		this.brand = title;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String author) {
		this.owner = author;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String publisher) {
		this.nickname = publisher;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String language) {
		this.quality = language;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getNumberOfMiles() {
		return numberOfMiles;
	}

	public void setNumberOfMiles(int numberOfPages) {
		this.numberOfMiles = numberOfPages;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public int getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(int isbn) {
		this.registerNumber = isbn;
	}

	public double getShippingWeight() {
		return shippingWeight;
	}

	public void setShippingWeight(double shippingWeight) {
		this.shippingWeight = shippingWeight;
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	public double getOurPrice() {
		return ourPrice;
	}

	public void setOurPrice(double ourPrice) {
		this.ourPrice = ourPrice;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getInStockNumber() {
		return inStockNumber;
	}

	public void setInStockNumber(int inStockNumber) {
		this.inStockNumber = inStockNumber;
	}

	public MultipartFile getBikeImage() {
		return bikeImage;
	}

	public void setBikeImage(MultipartFile bikeImage) {
		this.bikeImage = bikeImage;
	}
	
	
}
