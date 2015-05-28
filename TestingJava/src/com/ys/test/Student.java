package com.ys.test;

public class Student {
	
	private String name;
	private int age;
	
	public Student(){System.out.println("Student Super");}
	
	public Student(String name, int age){
		System.out.println("Student with Arg");
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
