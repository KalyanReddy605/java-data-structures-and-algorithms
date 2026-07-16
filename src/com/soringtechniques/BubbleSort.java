package com.soringtechniques;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,5,7,0,-1,0};
		System.out.println(arr.length);
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void bubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<(arr.length-1)-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp =arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		
	}

}
