package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.next();
        System.out.println("Enter the panno:");
        String panno = sc.next();
        System.out.println("Enter the emailid:");
        String email = sc.next();
        System.out.println("Enter the salary:");
        int sal = sc.nextInt();
        Customer c1 = new Customer(name, panno, email, sal);

        System.out.println("Enter the name:");
        name = sc.next();
        System.out.println("Enter the panno:");
        panno = sc.next();
        System.out.println("Enter the emailid:");
        email = sc.next();
        System.out.println("Enter the salary:");
        sal = sc.nextInt();
        Customer c2 = new Customer(name, panno, email, sal);

        boolean ans=c1.equals(c2);
        if(ans==true)
            System.out.println("Both the objects are equal.");
        else
            System.out.println("Both the objects are not equal.");
    }
}
