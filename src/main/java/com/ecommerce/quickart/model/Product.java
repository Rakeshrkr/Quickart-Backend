package com.ecommerce.quickart.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table(name="PRODUCT")
@Component
public class Product {
	@Id
	private int productId ;
	
	private String productName;
	
	private String productCategory ;
	
	private int quantity ;
	
	private float price ;
	

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		if(price<=0){
			System.out.println("Minimum Price should be 10,000");
			price= 0;
			
		}
		this.price = price;
	}	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
