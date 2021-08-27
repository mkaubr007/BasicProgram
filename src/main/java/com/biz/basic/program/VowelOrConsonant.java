package com.biz.basic.program;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Alphabets");
        char c=sc.next().charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
            System.out.println("Vowel");
        }
        else if((c>='a'&& c<='z')||(c>='A'&& c<='Z'))
            System.out.println("Consonant");
        else
            System.out.println("Not a Alphabet");

    }
}
