package questionBank;

import java.util.Scanner;

public class StringManipulations2 {


    public static void main(String[] args) {


        // Create a String variable and print all characters except the last character on the console in uppercases

        // Example: If the String is 'Java' you should print 'JAV' on the console



        String str1 = "Java";

        String newStr1 = str1.substring(0,str1.length()-1).toUpperCase();

        System.out.println(newStr1);


        // Create a String variable and print all characters except the first character and the last character on the console in uppercase

        // Example: If the String is 'Java' you should print 'AV' on the console


        String str2 = "Java";

        String newStr2 = str2.substring(1,str2.length()-1).toUpperCase();

        System.out.println(newStr2);




        // Type code to check if a String has just a single space character any position in the middle

        // Example: For 'Ali    Can' your code should print false on the console

        //          For '   AliCan ' your code should print false on the console

        //          For 'Ali Can' your code should print true on the console


        String name = "Tom Hanks";

        String trimmed = name.trim();

        String allExceptSpace = trimmed.replaceAll("\\s","");

        Boolean isSingleSpace = trimmed.length()-allExceptSpace.length()==1;

        System.out.println("is single space: " + isSingleSpace);


        // Type code to check if a String does not have any space character at the beginning and at the end?

        // Example : For ' Ali ' your code should print false on the console

        //           For 'Ali' your code should print true on the console


        String str4 = "Ali  ";

        String trimmedstr4 = str4.trim();

        Boolean result = str4.equals(trimmedstr4); //

        System.out.println(result);




        // Type code to check if a String has an uppercase initial and dot at the end.

        String str5 = "AlI.";

        Character initialOf = str5.charAt(0);

        Character lastCharOf = str5.trim().charAt(str5.length()-1);

        Boolean isTheFirstCharUpper = 'A'<=initialOf&&initialOf<='Z';

        Boolean isTheLastCharDot = lastCharOf=='.';

        Boolean check = isTheFirstCharUpper&&isTheLastCharDot;

        System.out.println("has an uppercase initial and dot at the end: " + check);



        // Type code to check if a password is valid or not for the following conditions;

        // Password must have at least 8 characters different from space character

        // Password must have at least 1 symbol


        String password = "ArifeMede";

        Boolean numOfChar = password.replaceAll("\\s","").length()>=8;

        Boolean hasSymbol = password.replaceAll("\\s","").replaceAll("[A-Za-z0-9]","").length()>0;

        System.out.println("Is the password valid: "  + (numOfChar&&hasSymbol));




        















    }
}
