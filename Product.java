package com.primi.wrapper.demo;

public class Product {
	private int id;
	private String name;
	private double price;
	
	public Product() {
		
	}
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	// getters and setters
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + "\nName: " + name + "\nPrice: " + price;
	}
	
	@Override
	public void finalize() {
		System.out.println("Object is is going to garbage collected");
	}
	
}
