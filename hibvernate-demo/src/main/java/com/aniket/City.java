package com.aniket;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class City {
	@Id
	private int cityId;
	private String cityName;
	private double cityArea;
	private int cityPopulation;
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public double getCityArea() {
		return cityArea;
	}
	public void setCityArea(double cityArea) {
		this.cityArea = cityArea;
	}
	public int getCityPopulation() {
		return cityPopulation;
	}
	public void setCityPopulation(int cityPopulation) {
		this.cityPopulation = cityPopulation;
	}
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", cityArea=" + cityArea + ", cityPopulation="
				+ cityPopulation + "]";
	}
	
	
}
