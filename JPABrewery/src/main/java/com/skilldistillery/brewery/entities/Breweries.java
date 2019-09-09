package com.skilldistillery.brewery.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "breweries")
public class Breweries {


//	address,categories,city,country,key,lat,long,name,phones,postalCode,province,websites

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String address;

	private String name;

	private String phone;
	
	private String province;
	
	private Integer zipcode;

	
	public Breweries() {

	}
	
	
	public Breweries(Integer id, String address, String name, String province, Integer zipcode) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
		this.province = province;
		this.zipcode = zipcode;
	}
	
	public Breweries(Integer id, String address, String name, String phone, String province, Integer zipcode) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
		this.phone = phone;
		this.province = province;
		this.zipcode = zipcode;
	}
	
	
	


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public Integer getZipcode() {
		return zipcode;
	}


	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}


	@Override
	public String toString() {
		return "Breweries [id=" + id + ", address=" + address + ", name=" + name + ", phone=" + phone + ", province="
				+ province + ", zipcode=" + zipcode + "]";
	}
	
	
}