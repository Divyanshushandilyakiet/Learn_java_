package com.company;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter v=> ");
        int v = sc.nextInt();
        System.out.println("Enter u=> ");
        int u = sc.nextInt();
        System.out.println("Enter a=> ");
        int a= sc. nextInt();
        System.out.println("Enter s=> ");
        int s =sc.nextInt();

        System.out.println("The solution of this ((v*v)-(u*u))/(2*a*s) expression is ");
        System.out.println(((v*v)-(u*u))/(2*a*s));



    }
}
