package com.ys.test.collections;

public class Student implements Comparable<Student> {
	
	private String name;
	private int age;
	
	public Student(String name,int age){
		super();
		this.name=name;
		this.age=age;
	}
	
	@Override
	public int compareTo(Student paramT) {
		return this.age-paramT.getAge();
	}
	
	@Override
	public boolean equals(Object obj){
		
		if(obj instanceof Student){
			Student std=(Student)obj;
			
			if( (null != this.name) && (null != std.getName()) ){
				if(this.name == std.getName() && this.age == std.getAge()){
					return true;
				}
			}
		}
		
		return false;
	}
	
	@Override
	public String toString(){
		return "Student name is :" +name+" & age is :"+age;
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
