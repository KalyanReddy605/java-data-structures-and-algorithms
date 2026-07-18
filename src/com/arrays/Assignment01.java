package com.arrays;

public class Assignment01 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4,1 };
		boolean flag = false;

		for (int i = 0; i < array.length; i++) {
			for(int j = i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					flag =true;
					break;
				}
			}
		}
		System.out.println(flag);

	}

}
