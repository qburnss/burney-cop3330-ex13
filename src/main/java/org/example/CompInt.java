/*
 *  UCF COP3330 Summer 2021 Assignment 13 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;
public class CompInt {
    public static void main(String[] args) {
        int principal, years, comp ;
        double interest, newInterest=0, Total=0, newTotal=0, exponent=0, insert=0;
        System.out.println("What is the principal?");
        Scanner scanner = new Scanner(System.in);
        String newprincipal = scanner.next();
        System.out.println("What is the rate of interest?");
        Scanner scanner1 = new Scanner(System.in);
        String newinterest = scanner1.next();
        System.out.println("What is the number of years?");
        Scanner scanner2 = new Scanner(System.in);
        String newyears = scanner2.next();
        System.out.println("What is the number of times the interest will be compounded per year?");
        Scanner scanner3 = new Scanner(System.in);
        String newcomp = scanner3.next();


        principal = Integer.parseInt(newprincipal);
        interest = Double.parseDouble(newinterest);
        years = Integer.parseInt(newyears);
        comp = Integer.parseInt(newcomp);

        newInterest = interest / 100;
        Total =   (1 + newInterest / comp);
        exponent = comp * years;
        insert = Math.pow(Total, exponent);

        newTotal = insert * principal;
        Math.ceil(newTotal);
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println(principal  + " invested at " + interest + "% for " + years + " years compounded " + comp + " times per year is " + numberFormat.format(newTotal) );
    }
}
