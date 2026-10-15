package com.aniket.app;

public class Person22 {

	
	String name;
	
	int age;
	Address address;
	String phoneNumber;
	public Person22(String name, int age, Address address, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Address getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	static class Address{
		
		String city;
		String zipCode;
		String State;
		public Address(String city, String zipCode, String state) {
			super();
			this.city = city;
			this.zipCode = zipCode;
			State = state;
		}
		public String getCity() {
			return city;
		}
		public String getZipCode() {
			return zipCode;
		}
		public String getState() {
			return State;
		}
		
	}

}
