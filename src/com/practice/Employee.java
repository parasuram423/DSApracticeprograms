 package com.practice;
class Employee {
    private int empId;
    private String empName;
    private double salary;

    // Constructor
    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;

        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
            System.out.println("Salary cannot be negative.");
        }
    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    // Display method
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}

// Developer class
class Developer extends Employee {
    private double bonusAmount;

    public Developer(int empId, String empName, double salary, double bonusAmount) {
        super(empId, empName, salary);
        this.bonusAmount = bonusAmount;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bonus Amount: " + bonusAmount);
    }
}

// Tester class
class Tester extends Employee {
    private double bugBonus;

    public Tester(int empId, String empName, double salary, double bugBonus) {
        super(empId, empName, salary);
        this.bugBonus = bugBonus;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bug Bonus: " + bugBonus);
    }
}

public class Employee {
    public static void main(String[] args) {

        Developer d = new Developer(101, "Deepak", 50000, 5000);
        Tester t = new Tester(102, "Rahul", 45000, 3000);

        System.out.println("Developer Details:");
        d.display();

        System.out.println("\nTester Details:");
        t.display();
    }
}