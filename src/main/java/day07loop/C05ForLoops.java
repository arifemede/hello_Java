package day07loop;

import java.util.Scanner;

public class C05ForLoops {

    public static void main(String[] args) {


        //Example 9: Type code to print fibonacci numbers, the number of fibonacci numbers will be given by user
        //           The user gave 6 ==> 1 1 2 3 5 8   (common interview question)


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci number you want to see...");
        int n = input.nextInt();

        int fibo1 = 1;
        int fibo2 = 1;   // value of fibo 1 and fibo 2 is given automatically in fibonacci.
        int fibo = 0;    // after first two number (1) the code will find other numbers. so we create a new container for next new data

         System.out.print(fibo1 + " ");
         System.out.print(fibo2 + " ");

        for(int i=1; i<n-1; i++){  // if user give 6, we must go 5. bcz in fibonacci number first two number is 1



            fibo = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibo;
            System.out.print(fibo + " ");
        }

        //3.00dk
    }
}
