package com.invoice.mapper;

public class CustomerToUsage {

	private String CUST_ID;
	private String METER_ID;
	private String TOTAL_USAGE;
	private String AMT;
	private String FROM_DATE;
	private String TO_DATE;
	private String TAXAMT;
	private String TOTALAMT;

	public String getTAXAMT() {
		return TAXAMT;
	}

	public void setTAXAMT(String tAXAMT) {
		TAXAMT = tAXAMT;
	}

	public String getTOTALAMT() {
		return TOTALAMT;
	}

	public void setTOTALAMT(String tOTALAMT) {
		TOTALAMT = tOTALAMT;
	}

	public String getCUST_ID() {
		return CUST_ID;
	}

	public void setCUST_ID(String cUST_ID) {
		CUST_ID = cUST_ID;
	}

	public String getMETER_ID() {
		return METER_ID;
	}

	public void setMETER_ID(String mETER_ID) {
		METER_ID = mETER_ID;
	}

	public String getTOTAL_USAGE() {
		return TOTAL_USAGE;
	}

	public void setTOTAL_USAGE(String tOTAL_USAGE) {
		TOTAL_USAGE = tOTAL_USAGE;
	}

	public String getAMT() {
		return AMT;
	}

	public void setAMT(String aMT) {
		AMT = aMT;
	}

	public String getFROM_DATE() {
		return FROM_DATE;
	}

	public void setFROM_DATE(String fROM_DATE) {
		FROM_DATE = fROM_DATE;
	}

	public String getTO_DATE() {
		return TO_DATE;
	}

	public void setTO_DATE(String tO_DATE) {
		TO_DATE = tO_DATE;
	}

}
