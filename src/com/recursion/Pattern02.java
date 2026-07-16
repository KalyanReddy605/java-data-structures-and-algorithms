package com.recursion;

public class Pattern02 {

	public static void main(String[] args) {
		triangle(4,1);
	}

	private static void triangle(int i, int j) {
		
		if(i==0) return;
		
		if(j<=i) {
			System.out.print("* ");
			triangle(i,j+1);
			
		}
		else {
			System.out.println();
			triangle(i-1,1);
		}
		
	}

}
