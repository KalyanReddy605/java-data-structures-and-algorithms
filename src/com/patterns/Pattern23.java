package com.patterns;

import java.util.Scanner;

public class Pattern23 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int count = 1;
			//space
			for(int j=0;j<n-i;j++) {
				System.out.print("  ");
			}
			//starts
			for(int k =0;k<n;k++) {
				if(count==1 || count == n|| i==1 ||i==n) {
				System.out.print("* ");
				count++;
				}
				else {
					System.out.print("  ");
					count++;
				}
			}
			System.out.println();
			sc.close();
		}
	}

}
