package com.vz.tnebapp.model;

import java.io.Serializable;
import java.util.Calendar;

public class MeterReading implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long smartMeterId;
	private Calendar startTime;
	private Long meterReadingStart;
	private Calendar endTime;
	private Long meterReadingEnd;
	public Long getSmartMeterId() {
		return smartMeterId;
	}
	public void setSmartMeterId(Long smartMeterId) {
		this.smartMeterId = smartMeterId;
	}
	public Calendar getStartTime() {
		return startTime;
	}
	public void setStartTime(Calendar startTime) {
		this.startTime = startTime;
	}
	public Long getMeterReadingStart() {
		return meterReadingStart;
	}
	public void setMeterReadingStart(Long meterReadingStart) {
		this.meterReadingStart = meterReadingStart;
	}
	public Calendar getEndTime() {
		return endTime;
	}
	public void setEndTime(Calendar endTime) {
		this.endTime = endTime;
	}
	public Long getMeterReadingEnd() {
		return meterReadingEnd;
	}
	public void setMeterReadingEnd(Long meterReadingEnd) {
		this.meterReadingEnd = meterReadingEnd;
	}
	
}
