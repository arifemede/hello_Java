package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C03IfStatement01 {


    public static void main(String[] args) {


        // If it rains, I will cancel the picnic.

        int a = 5;
        int b = 2;


        // if statement is used to execute codes under some conditions


        if (a % b == 1) {

            System.out.println("Activated..");

        }   // the condition is true, so the code will be executed


        // Example 1: Type code to print "Even" for even integers and "Odd" for odd integers

        //            Get the numbers from user


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to check if it is even or odd..");

        int x = input.nextInt();

        //1.Way:

        if (x % 2 == 0) {

            System.out.println("Even");
        }

        if (x % 2 != 0) {

            System.out.println("Odd");
        }


        //2.Way

        // Else is used for the last option

        if (x % 2 == 0) {

            System.out.println("Even");
        } else {

            System.out.println("Odd");
        }


        // Example 2: Type code to check if a number is positive, negative or neutral

        System.out.println("Enter a number to check if it is positive, negative or neutral");

        double y = input.nextDouble();


        //1.way:

        if (y > 0) {

            System.out.println("positive");
        }

        if (y == 0) {

            System.out.println("Neutral");
        }

        if (y < 0) {

            System.out.println("Negative");
        }


        //2.way: this way make java faster. so, for the conditions more than 2 we use else if/


        if (y > 0) {

            System.out.println("positive");
        } else if (y == 0) {

            System.out.println("Neutral");

        } else {

            System.out.println("Negative");
        }





    }
}
