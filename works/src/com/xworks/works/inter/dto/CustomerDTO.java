package com.xworks.works.inter.dto;

import com.xworks.works.inter.ProductType;

public class CustomerDTO {
	
	private String name;
	private String email;
	private ProductType productType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	
	

}
