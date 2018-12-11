package com.azr.model;

public class RentDataItem {

	private Integer	capacity;
	private Integer	monthyPrice;
	private String	startDay;
	private String	endDay;

	public RentDataItem(String capacity, String monthyPrice, String startDay, String endDay) {
		super();
		this.capacity = Integer.valueOf(capacity.trim());
		this.monthyPrice = Integer.valueOf(monthyPrice.trim());
		this.startDay = startDay.trim();
		this.endDay = endDay.trim();
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Integer getMonthyPrice() {
		return monthyPrice;
	}

	public void setMonthyPrice(Integer monthyPrice) {
		this.monthyPrice = monthyPrice;
	}

	public String getStartDay() {
		return startDay;
	}

	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}

	public String getEndDay() {
		return endDay;
	}

	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}

	 
}
