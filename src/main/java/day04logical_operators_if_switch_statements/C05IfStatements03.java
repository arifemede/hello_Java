package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C05IfStatements03 {

    public static void main(String[] args) {


        //Example 4: Type code to decide a day name is week day name or weekend day name


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day name");

        String dayName = input.next();

        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") || dayName.equalsIgnoreCase("Wednesday")

              || dayName.equalsIgnoreCase("Thursday") || dayName.equalsIgnoreCase("Friday");

        if(isWeekendDay) {
            System.out.println("Weekend Day");
        } else if (isWeekDay) {
            System.out.println("Week Day");
        }else {
            System.out.println("Invalid day name...");
        }

    }
    }

