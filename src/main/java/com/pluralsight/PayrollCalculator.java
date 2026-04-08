package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //gather info
        System.out.print("Enter employee name: ");
        String name = myScanner.nextLine();

        System.out.print("Enter hours worked: ");
        double hoursWorked = myScanner.nextDouble();

        System.out.print("Enter pay rate: ");
        double payRate = myScanner.nextDouble();

        //calculate pay
        double grossPay = hoursWorked * payRate;

        System.out.printf("Employee Name: %s%n", name);
        System.out.printf("Gross pay: $%.2f", grossPay);

        myScanner.close();



    }
}
