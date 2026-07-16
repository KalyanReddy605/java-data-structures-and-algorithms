package com.twopointers;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		int [] arr = new int[] {0,0,1,1,1,2,2,3,3,4};
		System.out.println(Arrays.toString(arr));
		removeDuplicates(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	private static int[] removeDuplicates(int[] arr) {
		
		int i=1;
		int count = 0;
		for(int j=1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				 arr[i + 1] = arr[j];
				count=arr[i+1];
				i++;
			}
		}
		System.out.println(count);
		return arr;
	}

}
