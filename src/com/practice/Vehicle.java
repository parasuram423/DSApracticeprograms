 package com.practice;

public class Vehicle {

    String brand = "Honda";
    String model = "Activa";
    int year = 2024;

    public void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.display();
    }
}
}
