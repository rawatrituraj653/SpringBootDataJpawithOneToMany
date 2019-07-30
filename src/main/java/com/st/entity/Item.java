package com.st.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Item_tab")
public class Item {

	@Id
	@Column(name="Item_id")
	private Integer id;
	@Column(name="Item_tab")
	private String name;
	@Column(name="Item_price")
	private double price;
	public Item(Integer id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public Item() {
		super();
	}
	
	
}
