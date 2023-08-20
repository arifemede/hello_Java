package replit_questions;

import java.util.Scanner;



        /*
        Write a Java program to find the number of days in a month.(Use Switch Case) (Interview Question / Leak Year)

        Sample:

          INPUT:

        Input a month number: 2

        Input a year: 2016

          OUTPUT  :

        February 2016 has 29 days

         */



        import java.time.YearMonth;
        class DaysInMonthUsingJavaTime {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a year: ");
                int year = scanner.nextInt();

                System.out.print("Enter a month (1-12): ");
                int month = scanner.nextInt();

                if (month < 1 || month > 12) {
                    System.out.println("Invalid month.");
                    return;
                }

                YearMonth yearMonth = YearMonth.of(year, month);
                int daysInMonth = yearMonth.lengthOfMonth();

                System.out.println("Number of days in the given month: " + daysInMonth);
            }
        }



