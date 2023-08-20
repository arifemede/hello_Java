package day05ternary_operator_string_manipulations;

import javax.print.DocFlavor;

public class C03Review {

    public static void main(String[] args) {

        // Example 1 : count the alphabetical characters in a given String
        // Tom Hanks!...


        String name = " tom Hanks...!";

        int newName = name.trim().replaceAll("[^A-Za-z]", "").length();

        System.out.println(newName);


        //Example 2: Type code to change all digits to "*" in a given password


        String pswd = " Tom Hanks123 ";

        String gvnpswd = pswd.trim().replaceAll("[0-9]", "*");

        System.out.println(gvnpswd);


        // Example 3: Get the initials from a full name (Middle Name is out of scope)
        //            Tom Hanks ---> TH


        String fullName = " Tom Hanks ";

        String firstInitial = fullName.trim().substring(0,1).toUpperCase();

        String lastInitial = fullName.trim().split(" ")[1].substring(0,1).toUpperCase();

        System.out.println(firstInitial+lastInitial);





    }
}
