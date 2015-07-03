package com.invoice.vo;

import java.math.BigDecimal;
import java.util.Date;

public class PDFDataVO {

	private String name;
	private String address;
	private BigDecimal meterId;
	private int totalUsage;
	private float amount;
	private String fromDate;
	private String toDate;
	private int customerId;

	private String TOTALAMT;
	private String TAXAMT;

	public String getTOTALAMT() {
		return TOTALAMT;
	}

	public void setTOTALAMT(String tOTALAMT) {
		TOTALAMT = tOTALAMT;
	}

	public String getTAXAMT() {
		return TAXAMT;
	}

	public void setTAXAMT(String tAXAMT) {
		TAXAMT = tAXAMT;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public BigDecimal getMeterId() {
		return meterId;
	}

	public void setMeterId(BigDecimal meterId) {
		this.meterId = meterId;
	}

	public int getTotalUsage() {
		return totalUsage;
	}

	public void setTotalUsage(int totalUsage) {
		this.totalUsage = totalUsage;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	
}
