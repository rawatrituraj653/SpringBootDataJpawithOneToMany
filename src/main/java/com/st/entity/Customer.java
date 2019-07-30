package com.st.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="customer_tab")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name="cust_id")
	private Integer id;
	@Column(name="cust_name")
	private String name;
	@Temporal(TemporalType.DATE)
	@Column(name="date")
	private Date date;
	@Column
	private String city;
	
	@Column(name="Item_tab")
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval =true)
	@JoinColumn(name = "customerId_fk",referencedColumnName = "cust_id")
	private Set<Item> items;

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", date=" + date + ", city=" + city + ", items=" + items + "]";
	}

	public Customer( String name,Date date, String city, Set<Item> items) {
		super();
		this.name = name;
		this.date = date;
		this.city = city;
		this.items = items;
	}

	public Customer() {
		super();
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}
	
	
	
	
}
