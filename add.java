package com.company;
import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number ");
        int a=sc.nextInt();
        System.out.print("Enter second number ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+c);

    }
}
