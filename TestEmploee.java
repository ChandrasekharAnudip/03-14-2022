package com.thiss.demo;

public class TestEmploee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		System.out.println(e1);
		
		Employee e2 = new Employee("E001","Ramesh");
		System.out.println(e2);
		
		Employee e3 = new Employee("E002", "Divya", 50000);
		System.out.println(e3);
		
		Employee e4 = e3.getEmployee();
		
		System.out.println(e4);
		
		System.out.println("e3 == e4:" + (e3 == e4));
		
		System.out.println("e2 == e3: " + (e2 == e3));

	}

}
