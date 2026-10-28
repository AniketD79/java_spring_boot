package com.aniket;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Office {

	@Id
	private int officeId;
	private String officeName;
	private int officeStrength;
	private double officeTurnOver;
	public int getOfficeId() {
		return officeId;
	}
	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public int getOfficeStrength() {
		return officeStrength;
	}
	public void setOfficeStrength(int officeStrength) {
		this.officeStrength = officeStrength;
	}
	public double getOfficeTurnOver() {
		return officeTurnOver;
	}
	public void setOfficeTurnOver(double officeTurnOver) {
		this.officeTurnOver = officeTurnOver;
	}
	@Override
	public String toString() {
		return "Office [officeId=" + officeId + ", officeName=" + officeName + ", officeStrength=" + officeStrength
				+ ", officeTurnOver=" + officeTurnOver + "]";
	}
	
	
}
