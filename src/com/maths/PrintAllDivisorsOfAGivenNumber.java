package com.maths;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllDivisorsOfAGivenNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				list.add(i);
			}
		}
		System.out.println(list.toString());
		sc.close();

	}

}
