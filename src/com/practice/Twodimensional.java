package com.practice;
import java.util.Scanner;
public class Twodimensional {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]= {{12,23,34},{34,56,54},{23,43,45}};
        for(int i=0;i<3;i++)
        {
        for(int j=0;j<3;j++)
        {
        	System.out.print(arr[i][j]+" ");
        } 
		System.out.println();
        }
	}

}
