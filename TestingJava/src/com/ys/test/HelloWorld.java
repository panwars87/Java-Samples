/**
 * 
 */
package com.ys.test;

/**
 * @author AC70602
 *
 */
public class HelloWorld {

	public static void main(String args[]){
				
		Student std = new Student();
		//std = null;  // Null pointer exception
		if(std.getName() == "Shashant"){
			System.out.println("True");
		}
		System.out.println("Student is : "+std.getName());
		
		System.out.println("-----------With Arg-------------------");
		
		//GandaStudent g2 = new GandaStudent("Shashant",26);
		//System.out.println("------------------------------");
		GandaStudent stu = new GandaStudent("Shashant",26);
		System.out.println(stu.getName());
		
	}
}
