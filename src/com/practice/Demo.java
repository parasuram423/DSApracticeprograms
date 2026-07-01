 package com.practice;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int i;
        String name[] = {"ram","parsu","ntr","devasana","kattapa"};

        for(i = 0; i < name.length; i++)
        {
            for(int j = name.length - 1; j >= 0; j--)
            {
                System.out.print(name[j] + " ");
            }
            System.out.println();
        }
    }
}