package com.practice;

import java.util.Scanner;
public class Max
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={23,43,67,9,45};
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum element in the array is: "+max);
    }
}