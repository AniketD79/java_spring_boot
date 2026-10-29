package com.aniket.SpringFirst;

public class Dev {

	private Javaa java;
	
	public Javaa getJava() {
		return java;
	}

	public void setJava(Javaa java) {
		this.java = java;
	}

	Dev(Javaa java){
		this.java=java;
	}
	
	public void code() {
		System.out.println("Coding...");
		java.coding();
	}
}
