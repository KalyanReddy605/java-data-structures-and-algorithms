package com.maths;

import java.util.Scanner;

public class ArmstrongNumberOrNot {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = num;
		int length = String.valueOf(num).length();
		int result = 0;
		while(num>0) {
			int digit = num%10;
			result +=Math.pow(digit, length);
			num/=10;
		}
		if(num1==result) {
			System.out.println("ArmstrongNumber");
		}
		else {
			System.out.println("Not ArmstrongNumber");
		}
		sc.close();
	}

}
