package com.maths;

public class TestDemo01 {

	public static void main(String[] args) {
		
		Integer a = 0;
		Integer c = a;
		int b = 10;
		add(a+1,b);
		a = 30;
		System.out.println(c);
	}

	private static void add(int i, int b) {
		System.out.println(i);
	}

	

}
