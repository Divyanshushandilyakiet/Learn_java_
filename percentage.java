package com.company;

import java.util.Scanner;

public class cbseper {
    public static void main(String[] args) {
      float percentage;
      float total;
      float scored;
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter total marks:: ");
        total = sc.nextFloat();

        System.out.print("Enter your marks:: ");
        scored = sc.nextFloat();

        percentage =(float)((scored/total)*100);
        System.out.println("Percentage::"+percentage);


    }
}
