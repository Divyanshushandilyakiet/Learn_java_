//Program to add even natural numbers
package com.company;
import java.util.Scanner;
public class natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int s=0,i;
        for (i =1;i<=n;i++)
        {
            s=s+2*i;
        }
        System.out.println("The sum of even natural number is "+s);
    }
}
