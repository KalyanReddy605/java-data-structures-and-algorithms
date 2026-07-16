package com.twopointers;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {

		int[] arr = { -1, 0, 2, 0, -1, -1, 3, 2, 0, 1 };
		List<int[]> arr1 = threeSum(arr);
        for(int[] a : arr1) {
        	for(int i : a) {
        		System.out.print(i+" ");
        	}
        	System.out.println();
        }
	}

	private static List<int[]> threeSum(int[] arr) {
		List<int[]> arr1 = new ArrayList<>();
		
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i + 1; j < arr.length-1; j++) {
				for (int k = j + 1; j < arr.length; j++) {
                       if(arr[i]+arr[j]+arr[k]==0) {
                    	   arr1.add(new int[] { arr[i], arr[j], arr[k] });
                       }
				}
			}
		}
		return arr1 ;
	}

}
