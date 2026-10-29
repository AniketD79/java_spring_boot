package com.aniket;

public class Ssd implements Memory {

	
	
	Ram ram;
	
	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	@Override
	public void store() {
		// TODO Auto-generated method stub
		
		System.out.println("Permanent Storage.");
		ram.store();
	}

}
