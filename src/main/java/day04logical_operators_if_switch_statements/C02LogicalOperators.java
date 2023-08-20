package day04logical_operators_if_switch_statements;

public class C02LogicalOperators {


    public static void main(String[] args) {

        // "AND" Logical Operator: &&

        // Note 1: to get "true" from && operation all must be true

        int i = 10;
        int k = 5;

        System.out.println((i>k) && (i==2*k) && (i/k==2) && (i%k==2)); // false. bcz one is false



        // "OR" Logical Operator: ||

        // to make the result true, one true is enough

        // to get false from || operation, all must be false

        int a = 6;
        int b = 2;

        System.out.println((a>=b) || (a%b!=0) || (a<=3*b));

        System.out.println((a==b) || (a%b!=0) || (a>3*b));


        // Note: There is no single usage of "|", in "OR" operation we must use "||"






    }

}
