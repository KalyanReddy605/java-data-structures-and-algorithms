package com.twopointers;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum01 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int [] result = twoPointer(arr ,target);
		System.out.println(Arrays.toString(result));
		sc.close();
		

	}

	private static int[] twoPointer(int[] arr, int target) {
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			if(arr[left] + arr[right]==target) {
				return new int[] {left,right};
			}
			else if(arr[left]+arr[right]>target) {
				right--;
			}
			else {
				left++;
			}
		}
		return new int[] {-1,-1};
	}
}
