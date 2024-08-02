package com.ravi.Hello;

import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sr.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println("Reverse: "+rev);
	}

}
