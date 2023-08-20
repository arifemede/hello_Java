package day04logical_operators_if_switch_statements;

public class C01PostPreIncrement {


    public static void main(String[] args) {


        //Post Increment

        int a = 12;

        int b = a++;   // Java is reading the code from left to the right.

                      // so after assignment operator '=' java see a. and it asign the value of a (12) to the b.

                      // after assign the value of a to the b, java see increment part. and increase the value of 'a' to the 13

        System.out.println(a); // 13

        System.out.println(b); // 12


        double x = 11.5;

        double y = x++;

        System.out.println(x);  // 12.5

        System.out.println(y);  // 11.5


        // Pre Increment

        int t = 10;

        int u = ++t;

        System.out.println(t); //11

        System.out.println(u); //11




    }
}
