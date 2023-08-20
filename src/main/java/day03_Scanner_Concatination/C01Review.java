package day03_Scanner_Concatination;

import java.util.Scanner;

public class C01Review {

    public static void main(String[] args) {


        //Example 1: Ask user to enter 2 numbers, then print the sum and the multiplication of the numbers on the console


        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers please");

        int num1 = input.nextInt();

        int num2 = input.nextInt();

        System.out.println("sum of the numbers: " + (num1+num2));

        System.out.println("multiplication of the numbers: " + (num1*num2));




    }
}
