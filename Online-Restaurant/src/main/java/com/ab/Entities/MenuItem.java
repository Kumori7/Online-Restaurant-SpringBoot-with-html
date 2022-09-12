package com.ab.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class MenuItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String itemCode;
	String category;
	double price;
	String name;

	public MenuItem() {

	}

	public MenuItem(int id, String itemCode, String category, double price, String name) {
		this.id = id;
		this.itemCode = itemCode;
		this.category = category;
		this.price = price;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", itemCode=" + itemCode + ", category=" + category + ", price=" + price
				+ ", name=" + name + "]";
	}

} // end of class
