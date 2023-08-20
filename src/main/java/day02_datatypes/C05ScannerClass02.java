package day02_datatypes;

import java.util.Scanner;

public class C05ScannerClass02 {


    public static void main(String[] args) {


        // Get user's name

        // 1. Step: Create Scanner Class Object

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name please");

        String name = input.nextLine();  // for string, use next.line

        System.out.println("Username: " + name);

        System.out.println("Enter your parent's first name...");

        String firstName = input.next(); // for first single word, use next method. it takes first word of entered data

        System.out.println(firstName);

    }
}
