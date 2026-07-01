package com.practice;
import java.util.Scanner;
public class Min {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr= {82,54,16,67,45};
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("minimum element number id:"+min);

	}

}
