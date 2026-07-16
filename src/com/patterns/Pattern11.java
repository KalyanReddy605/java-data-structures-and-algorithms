package com.patterns;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
			
		}
		sc.close();

	}

}
