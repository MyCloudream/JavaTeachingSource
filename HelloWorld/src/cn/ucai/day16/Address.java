package cn.ucai.day16;

import java.io.Serializable;

public class Address implements Serializable{
	private String city;
	private String street;
	public Address() {
		super();
	}
	public Address(String city, String street) {
		super();
		this.city = city;
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}
}
