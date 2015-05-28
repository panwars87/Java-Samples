package com.ys.crack.code;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first string.");
		String line1 = sc.next();
		System.out.println("Please enter second string.");
		String line2 = sc.next();
		System.out.println("Is Anagram: "+anagram(line1,line2));
	}

	private static boolean anagram(String line1,String line2){
		char[] line1Arr = line1.toCharArray();
		char[] line2Arr = line2.toCharArray();
		
		Arrays.sort(line1Arr);
		Arrays.sort(line2Arr);
		
		return Arrays.equals(line1Arr, line2Arr);
	}
	
}
