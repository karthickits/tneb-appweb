package com.vz.tnebapp.model;

import java.io.Serializable;

public class Meter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8255073981303393133L;
	private int id;
	private String type;
	private Customer customer;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
