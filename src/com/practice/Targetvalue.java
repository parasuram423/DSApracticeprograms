package com.practice;
import java.util.Scanner;
public class Targetvalue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,3,4,5};
		System.out.println("enter the target value");
		int target=sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{      
				System.out.println("found"+i);
				count++;
			}
			else
			{
				System.out.println("not found");
			}
		}
	}

}
