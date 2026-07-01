 package com.practice;

import java.util.Scanner;

public class Abstaraction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = arr[0][0] + arr[0][1] + arr[0][2]
                + arr[1][1]
                + arr[2][0] + arr[2][1] + arr[2][2];

        System.out.println(sum);
    }
}