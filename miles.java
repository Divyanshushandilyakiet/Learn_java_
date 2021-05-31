package com.company;

import java.util.Scanner;

//KMS to miles
public class miles {
    public static void main(String[] args) {
       double km;
        System.out.println("Please enter the kilometers");
        Scanner in = new Scanner (System.in);
        km =in.nextDouble();
        double miles = km/1.609;
        System.out.println(miles + " miles");
    }
}
