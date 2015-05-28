/**
 * 
 */
package com.ys.test.collections;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * @author AC70602
 *
 */
public class TestCollection {

	public static void main(String[] args) {
		//To sort integer....
		sortInteger();
		
		//To equals check for Student
		Student std1 = new Student("Shashant",26);
		Student std2 = new Student("Shashant",21);
		System.out.println("std1 == std2 is :"+(std1 == std2));
		System.out.println("(std1.equals(std2)) is :"+(std1.equals(std2)));
		
		List<Student> studentList = new ArrayList<Student>();
		sortStudent(studentList);
	}
	
	//To sort Student
	private static void sortStudent(List<Student> studentList){
		Student std1 = new Student("Shashant",26);
		Student std2 = new Student("Shashant",21);
		Student std3 = new Student("Nishu",28);
		Student std4 = new Student("Kittu",23);
		Student std5 = new Student("Shweta",22);
		
		studentList.add(std1);
		studentList.add(std2);
		studentList.add(std5);
		studentList.add(std3);
		studentList.add(std4);
		
		System.out.println("Before sort student list is is: "+studentList);
		Collections.sort(studentList);
		System.out.println("After sort student list is is: "+studentList);
	}
	
	//To sort Integer
	private static void sortInteger(){
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(100);
		list1.add(90);
		list1.add(95);
		list1.add(5);
		list1.add(110);
		list1.add(900);
	
		System.out.println("Before sort list is is: "+list1);
		Collections.sort(list1);
		System.out.println("Sorted list is is: "+list1);
	}

}
