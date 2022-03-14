package com.superr.demo;

public class Person {
	private String id;
	private String name;
	private String address;
	
	public Person() {
		
	}
	
	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Person(String id, String name, String address) {
		this(id,name);
		this.address = address;
	}
	
	// getters and setters
	
	@Override
	public String toString() {
		return "ID: " + id + "\nName: " + name +
				"\nAddress: " + address;
	}
}
