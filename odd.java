package com.company;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a natural number ");
        int N= sc.nextInt();
        for (int i=1;i<=N;i++)
            System.out.print(" "+(2*i-1));
    }
}
