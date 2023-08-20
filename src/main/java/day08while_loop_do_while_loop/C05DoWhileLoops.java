package day08while_loop_do_while_loop;

import java.util.Scanner;

public class C05DoWhileLoops {

    public static void main(String[] args) {


         /*
            Username is "admin", Password is "p12"
            Ask user to enter username and password
            User should see "Enter your username and password" message
            If user enters correct credentials, he should get "You are in your account!" message
            Otherwise, he should see "Enter your username and password" message 3 times
            After 3 times he should get "Your account is blocked" message
         */


        Scanner input = new Scanner(System.in);

        int counter = 0;  // I create a counter container. bcz I should count the number of enter. to see if it is more than 3 or not

        do{
            if(counter==3){   // if the user try more than 3;
                System.out.println("Your account is blocked...");
                break;
            }
            System.out.println("Enter your username");
            String u = input.next();

            System.out.println("Enter your password");
            String p = input.next();

            counter++;   // after every enterence I am increasing the value of the counter

            if(u.equals("admin") && p.equals("p12")){    // if both are true
                System.out.println("You are in your account...");
                break;   // if the user enter her account no need to continue for loop. so we break the loop after correct u and p
            }
        }while(true);// we do the loop condition true, to be able to continue the loop until 3 tries.
    }
}
