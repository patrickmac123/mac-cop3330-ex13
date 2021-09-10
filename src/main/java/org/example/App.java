package org.example;
import java.util.Scanner;
import java.math.*;
import java.text.NumberFormat;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 13 Solution
 *  Copyright 2021 Patrick Mac
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print( "What is the principal amount? " );
        String stringPrincipal = scan.nextLine();
        System.out.print( "What is the rate? " );
        String stringRate = scan.nextLine();
        System.out.print( "What is the number of years? " );
        String stringYears = scan.nextLine();
        System.out.print( "What is the number of times the interest is compounded per year? " );
        String stringCompound = scan.nextLine();


        double principal = Double.parseDouble(stringPrincipal);
        double rate = Double.parseDouble(stringRate);
        double years = Double.parseDouble(stringYears);
        double compound = Double.parseDouble(stringCompound);

        double interest = rate / 100;
        double total = principal*Math.pow((1+interest/compound),(compound*years));

        BigDecimal formatedTotal = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        System.out.println(defaultFormat.format(principal)+" invested at "+stringRate+"% for "+stringYears+" years compounded "+stringCompound+" times per year is "+defaultFormat.format(formatedTotal)+".");
    }
}