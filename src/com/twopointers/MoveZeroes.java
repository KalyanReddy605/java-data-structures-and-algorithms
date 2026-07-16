package com.twopointers;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 12, 14, 0, 17 };
		System.out.println(Arrays.toString(arr));
		int[] arr1 = moveZeroes(arr);
		//O(n2)
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = moveZeroes01(arr);
		//O(n)
		System.out.println(Arrays.toString(arr2));
		
	}

	private static int[] moveZeroes01(int[] arr) {
		
		int i=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				}
		}
		
		return arr;
	}

	private static int[] moveZeroes(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j]!=0 && arr[i]==0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				break;
				}
			}
		}
		return arr;
	}

}
