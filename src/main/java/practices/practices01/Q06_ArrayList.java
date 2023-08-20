package practices.practices01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q06_ArrayList {

    public static void main(String[] args) {

        /*
        Ask user to enter an Integer from 1 to 10

                 if the member user entered exists in the database change the number to "Bingo"
                 if the number user entered does not exist in the database add it into DB
                 if all records in the DB is "Bingo" give a message to the user like "You won!"

       */


        //first we are creating a database:

        List<String> dataBase = new ArrayList<>();
        dataBase.add("5");
        dataBase.add("7");
        dataBase.add("3");
        dataBase.add("9");


        // then we get the number from user:

        Scanner scan = new Scanner(System.in);

        int counter = 0;

        // we use do-while loop; bcz we want the message to be printed at least ones, and we also want to give a message at least one, and give them the option to start print again

        do{
            System.out.println("Enter a number please");

            String n = scan.next(); // we did it string bcz it is easier to compare with other numbers in database
            // then we will make it int

            int num = Integer.valueOf(n);

            if(num>10 || num<1){   // at the enter we type a code for wrong number, the loop will continue until the user enter appropriate number

                System.out.println("Enter a number between 1 to 10");
            }

            if (dataBase.contains(n)) {

                dataBase.set(dataBase.indexOf(n), "Bingo");
                counter++;
            }else {
                dataBase.add(n);
            }
            if (counter== dataBase.size()){
                System.out.println("You won!!");
                break;

            }
        }while(true);













    }
}
