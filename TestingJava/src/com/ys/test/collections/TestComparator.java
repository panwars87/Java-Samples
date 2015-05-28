/**
 * 
 */
package com.ys.test.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

/**
 * @author AC70602
 *
 */
public class TestComparator {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();
		sortEmployee(employeeList);
	}

	//To sort Employee
	private static void sortEmployee(List<Employee> employeeList){
		Employee std1 = new Employee("Shashant",26);
		Employee std2 = new Employee("Shashant",21);
		Employee std3 = new Employee("Nishu",28);
		Employee std4 = new Employee("Kittu",23);
		Employee std5 = new Employee("Shweta",22);

		employeeList.add(std1);
		employeeList.add(std2);
		employeeList.add(std5);
		employeeList.add(std3);
		employeeList.add(std4);

		System.out.println("Before sort Employee list is is: "+employeeList);
		Collections.sort(employeeList, new EmployeeAgeComparator());
		System.out.println("After sort Employee list is is: "+employeeList);
	}
}

class EmployeeAgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee paramT1, Employee paramT2) {
		return paramT1.getAge() - paramT2.getAge();		
	}

}

