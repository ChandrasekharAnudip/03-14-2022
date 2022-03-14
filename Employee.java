package com.thiss.demo;

public class Employee {
	private String id;
	private String name;
	private double salary;
	private String department;
	private String designation;
	
	private static int count=0;
	
	public Employee() {
		
	}
	
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
		//count ++;
		this.count ++;
		
	}
	
	public Employee(String id, String name, double salary) {
		//this.id = id;
		//this.name = name;
		
		this(id,name);
		this.salary = salary;
	}
	
	public Employee(String id, String name, double salary, String department) {
		this(id,name,salary);
		this.department = department;
	}
	
	
	public Employee(String id, String name, double salary, String department, String designation) {
		this(id,name,salary, department);
		this.designation = designation;
	}
	
	public Employee getEmployee() {
		//Employee emp = this;
		return this;
	}
	
	
	
	@Override
	public String toString() {
		return "ID: " + id + "\nName: " + name + "\nSalary: " + salary;
	}
}
