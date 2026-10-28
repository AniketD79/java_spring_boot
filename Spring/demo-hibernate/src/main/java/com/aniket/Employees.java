package com.aniket;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employees {
	@Id
	private int empId;
	private String empName;
	private String empRole;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empDepartment) {
		this.empRole = empDepartment;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDepartment=" + empRole + "]";
	}
	
}
