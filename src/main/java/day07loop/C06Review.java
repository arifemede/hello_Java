package day07loop;

import com.sun.jdi.IntegerValue;
import com.sun.jdi.Value;

public class C06Review {

    public static void main(String[] args) {



        //Example 10: Find the sum of the digits of decimal part in a double number
        //            28.587 ==> 5+8+7=20


        String number = "28.587";


        String decimal = number.split("\\.")[1];

        System.out.println(decimal);

        int ids = Integer.valueOf(decimal);  // 587

        int sumOfDigits = 0;


        for(int a=ids; a>0; a= a/10){   // for the value of a;

                                        // starting from value of ids; until a become 1; divide a to 10

            sumOfDigits = sumOfDigits + a%10;


           // System.out.println(sumOfDigits); if you type the output inside the loop, each step will be typed on the console:

            //     7   15  20

        }

        System.out.println(sumOfDigits);  // 20















    }
}
