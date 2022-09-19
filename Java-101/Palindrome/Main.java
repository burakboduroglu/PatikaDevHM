package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        String number = scan.nextLine();

        StringBuffer stringBuffer = new StringBuffer(number);
        StringBuffer reversed = stringBuffer.reverse();
        if (reversed.equals(stringBuffer)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
