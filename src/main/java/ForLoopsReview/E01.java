package ForLoopsReview;

import java.sql.SQLOutput;

public class E01 {
    public static void main(String[] args) {


        System.out.println("Q 1");

        //Example 1:Type code to print even integers from 5 to 16 on the console

        for (int i = 5; i < 17; i++) {

            if (i % 2 == 0) {

                System.out.println(i);
            }

        }

        System.out.println("Q 2");

        //Homework: Type code to print odd integers from 15 to 6 on the console

        for (int i = 15; i > 5; i--) {

            if (i % 2 != 0) {

                System.out.println(i);
            }

        }

        System.out.println("Q 3");

        //Example 2: Type code to print integers from 5 to 16 except 7 on the console


        for (int i = 5; i < 17; i++) {

            if (i != 7) {

                System.out.println(i);
            }
        }

        System.out.println("Q 4");

        //Example 3: Print String characters one by one on the console. If you see "x" stop printing
        //           "I like extra effort" ==> I like e


        String s = "I like extra effort";

        for (int i = 0; i < s.length(); i++) {

             if(s.charAt(i)=='x') {
                 break;

             }
            System.out.print(s.charAt(i));


        }

    }


}

