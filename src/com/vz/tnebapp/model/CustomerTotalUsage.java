package com.vz.tnebapp.model;

import java.io.Serializable;
import java.util.Calendar;

public class CustomerTotalUsage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Customer customer;
	private Meter meter;
	private long totalUsage;
	private Calendar fromDate;
	private Calendar toDate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomerId() {
		return customer;
	}
	public void setCustomerId(Customer customer) {
		this.customer = customer;
	}
	public Meter getMeterId() {
		return meter;
	}
	public void setMeterId(Meter meter) {
		this.meter = meter;
	}
	public long getTotalUsage() {
		return totalUsage;
	}
	public void setTotalUsage(long totalUsage) {
		this.totalUsage = totalUsage;
	}
	public Calendar getFromDate() {
		return fromDate;
	}
	public void setFromDate(Calendar fromDate) {
		this.fromDate = fromDate;
	}
	public Calendar getToDate() {
		return toDate;
	}
	public void setToDate(Calendar toDate) {
		this.toDate = toDate;
	}
}
