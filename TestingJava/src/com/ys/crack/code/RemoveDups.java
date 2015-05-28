package com.ys.crack.code;

import java.util.Scanner;

public class RemoveDups {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		System.out.println("Output is : "+removeDups(line));
	}
	
	private static String removeDups(String line){
		char lineArray[] = line.toCharArray();
		boolean[] flagArray = new boolean[256];
		int newIndex=0;
		
		for(int i=0;i<line.length();i++){
			int val=lineArray[i];
			if(!flagArray[val]){
				flagArray[val]=true;
				lineArray[newIndex]=lineArray[i];
				newIndex++;
			}
		}
		
		return String.copyValueOf(lineArray,0,newIndex);
	}

}
