package day07loop;

import com.sun.jdi.Value;

public class C02Review {

    public static void main(String[] args) {

        //Example 4: Type code to reverse a String (Interview Question)
        //           Alexa ==> axelA


        String s = "Alexa";


        for(int i = s.length()-1; i>=0; i -- ){

            System.out.print(s.charAt(i));
        }


        System.out.println("example 5");

        //Example 5: Type code to find the sum of the digits in an integer
        //           587 ==> 5+8+7 = 20


        int num = 587;

        num = Math.abs(num);

        int sumOfDigits = 0;

        for( int i=num; i>0; i=i/10){  // 'i' is starting with the value of num, you will divide i to 10 (i/10) , until the value of 'i' becomes 0

            sumOfDigits = sumOfDigits + i%10;

        }

        System.out.println(sumOfDigits);


        System.out.println(" example 6 ");


        //Example 6: Type code to find unique characters in a String
        //           Hello ==> Heo


        String a = "Abbc";

    //    String unique = "";

        for( int i =0; i<a.length() ; i++){


            char ch = a.charAt(i);   // ch is a character of string which coming from i

            if(a.indexOf(ch) == a.lastIndexOf(ch)){ //  in the string of a; if index of ch is equal to index of the last ch

           //     unique = unique + ch;

                System.out.print(ch);

            }
        }








    }
}
