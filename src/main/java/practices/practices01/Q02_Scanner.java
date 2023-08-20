package practices.practices01;

import java.util.Scanner;

public class Q02_Scanner {

    public static void main(String[] args) {


        /*

        Task: Ask user to enter her first name, age, height, and weight then print them on the console



         */


        Scanner scan = new Scanner(System.in);

        System.out.println("Write your first name please");

        String firstName = scan.next();

        System.out.println("Write your age please");

        int age = scan.nextInt();

        System.out.println("Write your height please");

        double height = scan.nextDouble();

        System.out.println( "Write your weight please ");

        double weight = scan.nextDouble();

        System.out.println("First Name: " + firstName + "\n" + "Age: " + age + "\n" + "Height: " + height + "\n" + "Weight: " + weight);

    }


}
