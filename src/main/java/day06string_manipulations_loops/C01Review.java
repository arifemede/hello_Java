package day06string_manipulations_loops;

public class C01Review {

    public static void main(String[] args) {


        // Example 1: Make the all digits except last 4 digits of a credit card invisible by using *

        //           1234 1234 1234 1234 ===> ****


        String password = "1234 1234 1234 1234";

        String newPassword = password.substring(0,15).replaceAll("[0-9]","*");

        String lastDigits = password.substring(15,19);

        System.out.println(newPassword + lastDigits);


        //Example 2: Count the number of characters different from space were used in a String
        //          "Tom Hanks was born in 1975."


        String s = "Tom Hanks was born in 1975";

        int count = s.replaceAll(" ","").length();

        System.out.println(count);




    }
}
