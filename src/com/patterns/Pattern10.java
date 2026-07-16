package com.patterns;

import java.util.Scanner;

public class Pattern10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= (2 * num) - 1; i++) {

            int result = i <= num ? i : (2 * num) - i;

            for (int j = 1; j <= result; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}