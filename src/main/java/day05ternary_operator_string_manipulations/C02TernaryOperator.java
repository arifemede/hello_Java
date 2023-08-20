package day05ternary_operator_string_manipulations;

public class C02TernaryOperator {

    public static void main(String[] args) {


        //Example 5 : Type code to check if an integer is odd and if it is even it should be divisible by 3.

        //           7 ===> Odd    12 ===> Even ===> divisible by 3


        int a = 12;

        String result1 = a%2!=0 ? "Odd"   : (a%3==0  ? "Even and divisible by 3"  : "Even but not divisible by 3") ;

        System.out.println(result1);



        //Example 6: Type java code by using nested ternary
        //Write a program to check if a year is leap year or not
        //If the year is divisible by 100 then it must be divisible by 400
        //if a year is not divisible by 100 then it must be divisible by 4


        int year = 1800;

        // structure of nested ternary: () ? () : () ;

        String isLeap =   year%100==0 ? (year%400==0? "leap year" : "not leap year") : (year%4==0 ? "leap year" : "not leap year");

        System.out.println(isLeap);






    }
}
