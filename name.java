package com.company;
// enter your name 
import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        System.out.println("What is your name ??");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " +name+ " have a good day...");
    }
}
