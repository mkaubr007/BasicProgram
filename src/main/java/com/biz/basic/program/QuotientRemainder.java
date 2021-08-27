package com.biz.basic.program;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter dividend");
        double d1=s.nextDouble();
        System.out.println("Enter divisor");
        double d2=s.nextDouble();
        double quotient=d1/d2;
        double remainder=d1%d2;
        System.out.println("Quotient: "+quotient);
        System.out.println("Remainder: "+remainder);
    }
}
