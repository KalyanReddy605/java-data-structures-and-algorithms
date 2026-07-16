package com.recursion;


public class PrintNNumbers {
	public static void main(String[] args) {
		
		print(1);
	}

	private static void print(int num) {
		if(num==10) {
			System.out.println(num);
			return;
		}
		System.out.println(num);
		num++;
		print(num);
		
	}

}
