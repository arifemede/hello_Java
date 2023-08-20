package replit_questions;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {


        /*

        Ask user to enter a str and a character, then check how many times the character is repeated in the str using loops in the str

        e.g:

       char ch1= 'a' ;

       String str =“John came late"

       Expected Output: Number of a = 2

         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");

        String name = scanner.nextLine();

        System.out.print("Enter a character: ");
        char character = scanner.nextLine().charAt(0);

        int count = 0;
        int index = 0;

        while (index < name.length()) {
            if (name.charAt(index) == character) {
                count++;
            }
            index++;
        }

        System.out.println("The character '" + character + "' is repeated " + count + " times in the name.");
    }
}