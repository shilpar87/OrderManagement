package com.mindtree.orderService.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddressEntity {

	@Id
	private int addressId;
	private String addressLine1;
	private String city;
	private String state;
	private String country;
	private String zipcode;

	public AddressEntity() {
		super();
	}

	public AddressEntity(int addressId, String addressLine1, String city, String state, String country,
			String zipcode) {
		super();
		this.addressId = addressId;
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public AddressEntity setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
		return this;
	}

	public String getCity() {
		return city;
	}

	public AddressEntity setCity(String city) {
		this.city = city;
		return this;
	}

	public String getState() {
		return state;
	}

	public AddressEntity setState(String state) {
		this.state = state;
		return this;
	}

	public String getCountry() {
		return country;
	}

	public AddressEntity setCountry(String country) {
		this.country = country;
		return this;
	}

	public String getZipcode() {
		return zipcode;
	}

	public AddressEntity setZipcode(String zipcode) {
		this.zipcode = zipcode;
		return this;
	}
}