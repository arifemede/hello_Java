package day03_Scanner_Concatination;

import java.util.Scanner;

public class C03ScannerClass03 {

    public static void main(String[] args) {



        // Example 3: Ask user to enter i)Full Name   ii)Age   iii)Height   iv)marital status

        // Print them on the console in different lines with a label


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name...");
        String name = input.nextLine();


        System.out.println("Enter your age...");
        byte age = input.nextByte();


        System.out.println("Enter your height in feet...");
        float height = input.nextFloat();


        System.out.println("Enter your marital status...");
        String maritalStatus = input.next();


        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("marital status: " + maritalStatus);


    }
}
