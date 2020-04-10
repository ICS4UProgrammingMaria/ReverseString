package com.company;
/*
 * Created by: Maria Temu
 * Created on: 2-April-2020
 * Created for: ICS4U
 * Day #25 (Reverse String)
 * This program calculates lets the user enter a string,
 * then the program returns it reversed
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String reverse = "";

        System.out.println("Please enter a string: ");
        Scanner read = new Scanner(System.in) ;
        String str = read.nextLine();


        for (int string = str.length() -1; string >= 0; string--)
        {
            reverse = reverse + str.charAt(string);
        }

        System.out.println(" \nThe reversed string is: ");
        System.out.println(reverse);
    }
}
