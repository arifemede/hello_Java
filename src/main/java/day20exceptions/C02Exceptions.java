package day20exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/*
        1)"throw" is used inside the method body, "throws" is used in the same line with the method name
        2)"throw" can be used multiple times in a method body, but "throws" can be used just once in a method
        3)"throw" is for throwing exceptions for some specific conditions.
          "throws" is for throwing exceptions, it is used for Compile Time Exceptions mostly...
        4)"throw" uses Exception Object, "throws" uses Exception Class Name
        5)After "throw" you can use just a single Exception Object, after "throws" you can use many Exception Class Names.
     */

public class C02Exceptions {

    public static void main(String[] args) {


        printAge(23);
        printAge(-23);

    }


// Create a method prints the user's age


    public static void printAge(int age) {   // if the value will be given on the console, we type void on the method

        if (age >= 0) {
            System.out.println(age);
        } else {
            throw new IllegalArgumentException("Age can not be negative..."); // for the usage of -age, it is Illegalargument. so I select this method
        }

    }

    public static void findAndReadTheFile () throws IOException {   // 'throws' is not inside the method body, but inside the same line with method



            FileInputStream fis = new FileInputStream("src/main/java/day20exceptions/MyFile.txt");  // this code is to access the file


            int k = 0; // I am creating an integer container. And use while loop;

            while((k=fis.read())!= -1){ // k is starting from ASCII value of J, (first letter of MyFile text) ==> from k to the end of the text file
                // this code will get every char from the text file

                System.out.print((char)k);  // then it print it as char again,

            }


            // when to use throw, when to use throws?

            // How to use throw, how to use throws?


        /*Differences between throw and throws keyword:

        1) 'Throw' keyword is used inside the method body

           'Throws' is not inside the method body. It is at the same line with the method name.

        2)  We use throw keyword to throw exceptions for some conditions

            But throws is for handling compile time exceptions (red underline) =>

        3) Throws can be used just one

            But throw can be used many times

         */






    }




    }

