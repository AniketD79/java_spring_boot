




package com.aniket.app;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//import com.aniket.app.Person.Address;


@Entity
public class Person {
	Person(){}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	String name;

	int age;
	@Embedded
	Address address;
	String phoneNumber;
	public Person(Long id, String name, int age, Address address, String phoneNumber) {
		super();
		this.id= id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public Long getId() {
		return id;
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

@Embeddable
	static class Address{
Address(){}
		String city;
		String zipcode;
		String State;
		public Address(String city, String zipcode, String state) {
			super();
			this.city = city;
			this.zipcode = zipcode;
			State = state;
		}
		public String getCity() {
			return city;
		}
		public String getZipCode() {
			return zipcode;
		}
		public String getState() {
			return State;
		}

	}
}


