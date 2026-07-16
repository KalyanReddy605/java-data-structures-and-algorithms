package com.twopointers;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "Panama";
		
		String[] split = s.split("");
		System.out.println(Arrays.toString(split));
		String.join(s, split);
		
	    for(String a : split) {
	    	Boolean result = "AEIOUaeiou".indexOf(a)!=-1;
	    	System.out.println(a+"--->"+result);
	    }
		
	}

}
