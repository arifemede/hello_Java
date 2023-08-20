package replit_questions;

import java.util.Scanner;

public class ENGIfSwitchTernaryStringMeth2 {

    public static void main(String[] args) {

        /* Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)


        (Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

        Input :

        John White 1234234534561478

        Output :

        Name : J*** W****

        CCN  : **** **** **** 1478   */


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name, surname please");

        String name = scan.next();

        String surname = scan.next();

        System.out.println("Enter your password please");

        String ccn = scan.next();

        if(ccn.length()!=16){
            System.out.println("Invalid password number");
        } else {

            String firstInitial = name.trim().substring(0,1).toUpperCase();

            String lastPartOfName = name.trim().substring(1).replaceAll("[a-zA-z]", "*");

            String newName = firstInitial+lastPartOfName;

            String lastInitial = surname.trim().substring(0,1).toUpperCase();

            String lastPartOfSurname = surname.trim().substring(1).replaceAll("[a-zA-Z]","*");

            String newSurname = lastInitial + lastPartOfSurname;

            String ccnFirstForth = ccn.substring(0,4).replaceAll("[0-9]", "*");

            String ccnsecondForth = ccn.substring(5,9).replaceAll("[0-9]", "*");

            String ccnThirdForth = ccn.substring(10,14).replaceAll("[0-9]","*");

             String ccnLastPart = ccn.substring(12);

             System.out.println("Name: " + newName + " " + newSurname);

            System.out.println(ccnFirstForth + " " + ccnsecondForth + " " + ccnThirdForth + " " + ccnLastPart);


        }


    }





    }

