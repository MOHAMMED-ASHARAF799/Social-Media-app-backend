package com.social.media.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ItemsNames {

	@Id
	String imgUrl;
	String category;
	String name;
	int price;
	public ItemsNames() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemsNames(String imgUrl, String category, String name, int price) {
		super();
		this.imgUrl = imgUrl;
		this.category = category;
		this.name = name;
		this.price = price;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ItemsNames [imgUrl=" + imgUrl + ", category=" + category + ", name=" + name + ", price=" + price + "]";
	}
	

}