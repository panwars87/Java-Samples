package com.ys.crack.code;

import java.util.Scanner;

public class UniqueChar {

	//inout string ababcdefcdeg , how unique char
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string....");
		boolean flag = true;
		String str = sc.next();
		
		if(isUniqueChars2(str)){
			System.out.println("Hurray! string is unique....");
		}else{
			System.out.println("String is not unique....");
		}
		
		/*if(str != null){
			char[] chr = str.toCharArray();
			mainloop:
			for(int i=0;i<str.length();i++){
				int charcount=0;
				char temp = chr[i];
				for(char c:chr){
					if(temp == c){
						charcount+=1;
						if(charcount > 1){
							flag=false;
							break mainloop;
						}
					}
				}
			}
			
		if(flag){
			System.out.println("Hurray! string is unique....");
		}else{
			System.out.println("String is not unique....");
		}
			
		}*/
	}
	
	public static boolean isUniqueChars2(String str) {
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			//fetch the ascii value of that character
			int val = str.charAt(i);
			//check the flag value in flag-array.
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}

}
