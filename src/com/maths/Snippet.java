package com.maths;

public class Snippet {
	static int evenlyDivides(int n) {
	        // code here
	        int count = 0;
	         while(n >0){
	             int digit = n%10;
	             if(n%digit==0){
	                 count++;
	             }
	              n = n/10;
	         }
	         return count;
	    }
}

