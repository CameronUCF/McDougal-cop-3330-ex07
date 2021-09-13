/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        final double CONVERSION_FACTOR = 0.09290304;
        int length;
        int width;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of the room in feet?");
        length = scanner.nextInt();

        System.out.println("What is the width of the room in feet?");
        width = scanner.nextInt();

        scanner.close();

        System.out.printf("You entered dimensions of %d feet by %d feet.", length, width);

        System.out.printf("The area is\n%d square feet\n%.3f square meters", length * width, (length * width) * CONVERSION_FACTOR);
    }
}
