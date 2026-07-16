package com.maths;

import java.util.Scanner;

public class GCDOfTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int n1=sc.nextInt();
		int temp = 0;
		for(int i =1;i<=Math.min(n1, n);i++) {
			if(n%i==0 && n1%i==0) {
				temp=i;
			}
		}
		System.out.println("Greatest common factor: "+temp);
		sc.close();
	}

}
