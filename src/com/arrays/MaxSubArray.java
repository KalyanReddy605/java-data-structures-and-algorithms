package com.arrays;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] array = {2,4,6,8,10};
		int max = Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			for(int j =  i ;j<array.length;j++) {
				int total =0;
				for(int k = i ;k<=j;k++) {
					total+=array[k];
				}
				if(max<total) {
					max=total;
				}
			}
		}
		System.out.print("Max value Of SubArray : "+max);
	}

}
