package com.aniket;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int age;
	private String phoneNumber;
	
	@Embedded
	private Address address;
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public Address getAddress() {
		return address;
	}
	public Person(Long id, String name, int age, String phoneNumber, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
Person(){}
}


@Embeddable
class Address{
	private String city;
	private String zipcode;
	private String state;
	public String getCity() {
		return city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public String getState() {
		return state;
	}
	public Address(String city, String zipcode, String state) {
		super();
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
	}
	Address(){}
}
