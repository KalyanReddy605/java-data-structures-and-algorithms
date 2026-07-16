package com.recursion;

public class RecursionExample {
	
	public static void main(String[] args) {
		print1(1);
	}
	static void  print1(int n) {
		print2(2);
		System.out.println(n);
	}
	static void print2(int i) {
		print3(3);
		System.out.println(i);
	}
	static void print3(int i) {
		print4(4);
		System.out.println(i);
	}
	static void print4(int i) {
		print5(5);
		System.out.println(i);
		
	}
	 static void print5(int i) {
		 System.out.println(i);
		
		
	}

}
