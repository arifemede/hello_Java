package day02_datatypes;

import java.util.Scanner;

public class C04ScannerClass01 {

    public static void main(String[] args) {


        // Scanner Class: It is used to get data from user.

        //1. Step: Create a Scanner Class Object

        Scanner input = new Scanner(System.in);


        //2.Step : Give a message to the user

        System.out.println("Enter your age...");


        //3.Step : Get the data user entered

        int userAge = input.nextInt();

        System.out.println(userAge);






    }


}
