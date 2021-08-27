package com.biz.basic.program;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        if(a%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
}
