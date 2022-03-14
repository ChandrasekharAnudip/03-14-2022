package com.superr.demo;

public class Customer extends Person {
	private double billAmount;
	
	public Customer() {
		
	}
	
	public Customer(String id, String name) {
		//this(id,name);
		super(id,name);
	}
	
	public Customer(String id, String name, String address) {
		//super(id, name, address);
		this(id,name);
	}
	
	public Customer(String id, String name, String address, 
					double billAmount) {
		
		//super(id, name, address);
		this(id,name,address);
		this.billAmount = billAmount;
	}
	
	// getters and setters
	
	@Override
	public String toString() {
		return super.toString() + "\nBill Amount: " + billAmount;
	}
}
