package com.ys.test.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		List<String> stringList = new ArrayList<String>();

		intList.add(10);
		intList.add(21);
		intList.add(30);
		intList.add(45);

		stringList.add("Nishu");
		stringList.add("Kittu");
		stringList.add("Shweta");
		stringList.add("Raju");

		getListValues(intList);
		getListValues(stringList);
	}

	private static <T extends Object> void getListValues(List<T> t){
		System.out.print("Values are :");
		for(int i=0;i<t.size();i++){
			System.out.print(t.get(i)+" ");
		}
		System.out.println();
	}
}
