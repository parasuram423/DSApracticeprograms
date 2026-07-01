 package com.practice;

public class Developer {

    String name = "Parasuram";
    int id = 101;
    String role = "Java Developer";

    public void display() {
        System.out.println("Developer ID : " + id);
        System.out.println("Developer Name : " + name);
        System.out.println("Role : " + role);
    }

    public static void main(String[] args) {

        Developer dev = new Developer();
        dev.display();
    }
}
