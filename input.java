package com.company;

import java.util.Scanner;

public class CWH_05_input {
    public static void main(String[] args) {
        System.out.println("Taking the input form the user");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("The sum of these two numbers are: ");
        System.out.println(sum);

    }
}
