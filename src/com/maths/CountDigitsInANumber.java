package com.maths;

import java.util.Scanner;

public class CountDigitsInANumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int temp =num;
		int count=0;
		while(num>0) {
			num/=10;
			count++;
		}
		System.out.println("The number "+temp+ " has "+count+" digits.");
		sc.close();
	}

}
