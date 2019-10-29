package com.haris.bean;

public class Address {

	private int id;
	private String house;
	private String street;
	private String village;
	private String district;
	private String state;
	private int pin;
	public Address(int id, String house, String street, String village, String district, String state, int pin) {
		super();
		this.id = id;
		this.house = house;
		this.street = street;
		this.village = village;
		this.district = district;
		this.state = state;
		this.pin = pin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", house=" + house + ", street=" + street + ", village=" + village + ", district="
				+ district + ", state=" + state + ", pin=" + pin + "]";
	}
	
	
}
