//Program to add first n natural number 
package com.company;
import java.util.Scanner;
public class first_natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number ");
        int n = sc.nextInt();
        int s=0,i;
        for (i=1;i<=n;i++)
        {
            s=s+i;
        }
        System.out.println("The sum of the natural number is "+s);
    }
}
