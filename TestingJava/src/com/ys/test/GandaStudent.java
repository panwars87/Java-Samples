package com.ys.test;

public class GandaStudent extends Student{

	public String name;
	public int age;
	public int rank;
	
	public GandaStudent() {System.out.println("Ganda without arg");}
	
	public GandaStudent(String name, int age) {
		super(name,age);
		System.out.println("Ganda with arg");
		this.name=name;
		this.age=age;
	}

}
