package com.recursion;

import java.util.Scanner;

public class ReverseOfNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.println(num + " = " + reverse(num, 0));
        sc.close();
    }

    private static int reverse(int num, int result) {

        if (num == 0) {
            return result;
        }
        
        int digit = num % 10;

        result = result * 10 + digit;

        return reverse(num / 10, result);
    }
}