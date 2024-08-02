package com.ravi.Hello;

public class ArrayInteger {

	public static void main(String[] args) {
		
		int a[]= {1,2,5,4};
		int n= a.length+1;
		int sum = n*(n+1)/2;
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			s=s+a[i];	
		}
		int num = sum-s;
		System.out.println(num);
	}
}
