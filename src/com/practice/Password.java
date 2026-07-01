 package com.practice;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctPassword = "Java123";

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (password.equals(correctPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Password");
        }

        sc.close();
    }
}
