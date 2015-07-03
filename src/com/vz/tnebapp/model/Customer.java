package com.vz.tnebapp.model;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String age;
	private String gender;
	private String address;
	private String phoneNo;
	private String emailAddress;
	private Date connectionDate;
	
	public Customer(String name,String age,String gender,String address,String phoneNo,String emailAddress) {
		this.name = name;
		this.gender=gender;
		this.address=address;
		this.phoneNo=phoneNo;
		this.emailAddress = emailAddress;
		this.connectionDate=new Date();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Date getConnectionDate() {
		return connectionDate;
	}
	public void setConnectionDate(Date connectionDate) {
		this.connectionDate = connectionDate;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
