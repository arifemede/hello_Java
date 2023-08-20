package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C07IfStatements05 {


    public static void main(String[] args) {


        //Nested If Statement

        //Example 6:

        /*
        If a number is even check if it is divisible by 3 or not.
        If it is divisible by 3 the output will be " perfect even number" otherwise, the output will be "Good even number"
        If the number is odd then check if it is divisible by 3 or not
        If it is divisible by 3 the output will be "perfect odd number" otherwise, the output will be "Good odd number"

        */


       Scanner input = new Scanner(System.in);

       System.out.println("Enter an integer please");

       int num = input.nextInt();



       if(num%2==0){
           if(num%3==0){
               System.out.println("Perfect Even Number");
           }else{
               System.out.println("Good Even Number");
           }
       }else {
           if(num%3==0){
               System.out.println("Perfect Odd Number");
           }else{
               System.out.println("Good Odd Number");
           }
       }

       //Note: Nested structures need more time to be executed. We do not prefer to use nested structured in Java

       //      If something needs more time to be executed, it is called "It has time complexity"


    }
}
