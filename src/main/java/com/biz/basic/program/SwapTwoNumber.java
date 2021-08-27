package com.biz.basic.program;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int x,y,z;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter value of x and y");
        x=s.nextInt();
        y=s.nextInt();
        System.out.println("Value before swapping");
        z=x;
        x=y;
        y=z;
        System.out.println("Value after swapping: "+"x: "+x+ " "+"y: "+y);
        System.out.println();
    }
}
