package com.aniket.app;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	 Long empId;
	 String empName;
	 String empDepartment;
	 double empSalary;
	 
	 @Embedded
	 Address address;
	
	 public Long getEmpId() {
		 return empId;
	 }
	 public String getEmpName() {
		 return empName;
	 }
	 public String getEmpDepartment() {
		 return empDepartment;
	 }
	 public double getEmpSalary() {
		 return empSalary;
	 }
	 public Address getAddress() {
			return address;
		}
	 public Employee(Long empId, String empName, String empDepartment, double empSalary, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empSalary = empSalary;
		this.address = address;
	 }
	 
	 public Employee() {};
	 
}

@Embeddable
class Address{
	
	String empCity;
	String empZipCode;
	String empState;
	public String getEmpCity() {
		return empCity;
	}
	public String getEmpZipCode() {
		return empZipCode;
	}
	public String getEmpState() {
		return empState;
	}
	public Address(String empCity, String empZipCode, String empState) {
		super();
		this.empCity = empCity;
		this.empZipCode = empZipCode;
		this.empState = empState;
	}
	public Address() {};
}
