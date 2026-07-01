package com.practice;
import java.util.Scanner;
public class Jaggedarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]= {{23,43,34},{45,98},{90,89,90}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
