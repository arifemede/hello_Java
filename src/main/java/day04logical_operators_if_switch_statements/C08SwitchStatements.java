package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C08SwitchStatements {


    public static void main(String[] args) {


        // Example 1: Type code gives you the name of the day after giving number of the day

        //          1 ==> Sunday          2==>Monday


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter day number to see day name");

        byte dayNum = input.nextByte();


        switch (dayNum){

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }


        // You can use int, byte, short, char,  String with switch statement






    }
}
