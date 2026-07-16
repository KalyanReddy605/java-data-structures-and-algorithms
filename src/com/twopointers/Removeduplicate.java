package com.twopointers;

import java.util.Arrays;

public class Removeduplicate {
	public static void main(String[] args) {
		int count = 7;
		String binaryString = Integer.toBinaryString(count);
		String[] split = binaryString.split("");
		boolean bitSet = isBitSet(count);
		System.out.println(bitSet);
		
	}
	public static boolean isBitSet(int n) {
        // code here
        String binaryString = Integer.toBinaryString(n);
        String[] split = binaryString.split("");
        System.out.println(Arrays.toString(split));
        for(String i : split){
            if(!i.equals("1")){
                return false;
            }
        }
        return true;
    }

}
