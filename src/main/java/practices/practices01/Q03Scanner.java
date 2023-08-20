package practices.practices01;

import java.util.Scanner;

public class Q03Scanner {

    public static void main(String[] args) {

        // Type a code that calculate the hpypotenuse


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of first length of the triangle");

        double a = input.nextDouble();

        System.out.println("Enter the length of second length of the triangle");

        double b = input.nextDouble();

        System.out.println(Math.sqrt(a * a) + (a * b));


    }
}
