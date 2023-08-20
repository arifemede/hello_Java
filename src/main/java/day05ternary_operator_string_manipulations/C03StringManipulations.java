package day05ternary_operator_string_manipulations;

public class C03StringManipulations {


    public static void main(String[] args) {




        //Remove the non-alphabetical characters

        //If we want to work with aa group of data we use "Regular Expressions" (Regex)

        /*

        i) Upper case letters: [A-Z]
        ii)Lower case letters: [a-z]
        iii)All letters: [A-Za-z]
        iv) All digits: [0-9]
        v) Letters from m to v : [m-v]
        vi) Regex for a, b, e, d, g, z: [abdedgz]

        a)All characters different from uppercase letters: [^A-Z]
        b)All characters different from lowercase letters: [^a-z]
        c)All characters different from all letters: [^A-Za-z]
        d)All characters different from digits: [^0-9]
        e)All symbols: [^A-Za-z0-9]
        f)All punctuations: \\p{Punct}

       */


        // Example 1 : count the alphabetical characters in a given String
        // Tom Hanks!...

        String s1 = "Tom Hanks!...";

        int numOfChar  = s1.replaceAll("[^A-Za-z]", "").length();

        System.out.println(numOfChar);


         // replaceAll() ==> it removes a group of data(regex) puts the required characters in place of them



        //Example 2: Type code to change all digits to "*" in a given password

        String password = "Pswd123";

        String newPassword = password.replaceAll("[0-9]","*");

        System.out.println(newPassword);


        // Example 3: Get the initials from a full name (Middle Name is out of scope)
        //            Tom Hanks ---> TH tom hanks


        String name = " tOm hAnks  ";

        // trim() => removes the extra spaces from the beginning and from the end of a String value


        String firstInitial = name.trim().substring(0, 1).toUpperCase();  //T

        //                   "tOm Hanks" . t          .   T

        System.out.println(firstInitial);

        String secondInitial = name.trim().split(" ")[1].substring(0,1).toUpperCase();  // H

        //                    "tOm Hanks" .   Hanks           .  h           .    H

        System.out.println(secondInitial);

        System.out.println(firstInitial + secondInitial); // TH


    }
}
