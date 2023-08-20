package day03_Scanner_Concatination;

import java.util.Scanner;

public class C02Review {

    public static void main(String[] args) {

        // Example 2: Ask user to enter the width and the length of a rectangle, then print the area and perimeter on the console


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of a rectangle");

        double length = input.nextDouble();

        System.out.println("Enter the width of a rectangle");

        double width = input.nextDouble();

        System.out.println("Area: " + width*length);

        System.out.println("perimeter: " + (2*(width+length)));

    }
}
