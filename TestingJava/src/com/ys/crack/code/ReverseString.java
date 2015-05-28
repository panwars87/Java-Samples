package com.ys.crack.code;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter text...");
		String line = sc.next();
		System.out.println("Output String is: "+reverse(line));
	}
	
	private static String reverse(String line){
		char temp[] = new char[line.length()];
		int k=0;
		char[] strArray = line.toCharArray();
		
		for(int i=(line.length()-1);i>=0;i--){
			temp[k]=strArray[i];
		    k++;
		}
		return String.copyValueOf(temp);
	}

}
