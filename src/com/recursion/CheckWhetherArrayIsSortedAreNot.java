package com.recursion;

public class CheckWhetherArrayIsSortedAreNot {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,8,9,10};
		System.out.println(checkArrayIsSortedAreNot(arr, 0));
	}

	private static boolean checkArrayIsSortedAreNot(int[] arr,int i) {
		if(i==arr.length-1) {
			return true;
		}
		return arr[i]<=arr[i+1] && checkArrayIsSortedAreNot(arr,i+1);
	}

}
