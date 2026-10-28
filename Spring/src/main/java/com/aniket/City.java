package com.aniket;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class City {

	
	@Id
	private int cityId;
	private String cityName;
	private int cityPopulation;
	private int cityZipCode;
	@Embedded
	private SexRatio sexRatio;
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
	public int getCityPopulation() {
		return cityPopulation;
	}
	public void setCityPopulation(int cityPopulation) {
		this.cityPopulation = cityPopulation;
	}
	public int getCityZipCode() {
		return cityZipCode;
	}
	public void setCityZipCode(int cityZipCode) {
		this.cityZipCode = cityZipCode;
	}
	
	public SexRatio getSexRatio() {
		return sexRatio;
	}
	public void setSexRatio(SexRatio sexRatio) {
		this.sexRatio = sexRatio;
	}
	
	
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", cityPopulation=" + cityPopulation
				+ ", cityZipCode=" + cityZipCode + ", sexRatio=" + sexRatio + "]";
	}
	
}

@Embeddable
class SexRatio{
	
	private int cityMales;
	private int cityFemales;
	public int getCityMales() {
		return cityMales;
	}
	public void setCityMales(int cityMales) {
		this.cityMales = cityMales;
	}
	public int getCityFemales() {
		return cityFemales;
	}
	public void setCityFemales(int cityFemales) {
		this.cityFemales = cityFemales;
	}
	@Override
	public String toString() {
		return "SexRatio [cityMales=" + cityMales + ", cityFemales=" + cityFemales + "]";
	}
	
	
	
}
