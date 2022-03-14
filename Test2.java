package com.primi.wrapper.demo;

public class Test2 {

	public static void main(String[] args) {
		Product p1 = new Product(101, "Mobile", 7500);
		System.out.println(p1.getName());
		
		p1=null;
		
		System.gc();
		
		System.out.println("End");

	}

}
