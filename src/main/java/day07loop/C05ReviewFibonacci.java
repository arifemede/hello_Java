package day07loop;

import java.util.Scanner;

public class C05ReviewFibonacci {

    public static void main(String[] args) {


        //Example 9: Type code to print fibonacci numbers, the number of fibonacci numbers will be given by user
        //           The user gave 6 ==> 1 1 2 3 5 8   (common interview question)


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number please");

        int number = input.nextInt();

        int fibo1 = 1;

        int fibo2 = 1;

        int fibo  = 0;

        System.out.println(fibo1 + " ");

        System.out.println(fibo2 + " ");

        for(int i=1; i<number-1; i++){


            fibo = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibo;
            System.out.print(fibo + " ");


        }

    }
}
