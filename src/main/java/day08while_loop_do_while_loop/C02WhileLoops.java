package day08while_loop_do_while_loop;

public class C02WhileLoops {

    public static void main(String[] args) {



        //Example 3: Type code to find the sum of the digits of an integer
        //           587 ==> 5+8+7=20


        int i=587;
        int sumOfDigits = 0;

        // to find the last digit of number everytime we use i%10;

        while(i>0){

            sumOfDigits = sumOfDigits + i%10;
            i/=10;
        }
        System.out.println(sumOfDigits);



        //Example 4: Type code to create multiplication table for the given integer.
        //           3 ==> 3x1=3  3x2=6  3x3=9 ... 3x9=27  3x10=30


        int number = 3;  // 3 is constant number. in every loop the first number is constant, not change

        int k = 1;   // starting from 1

        while(k<11){  // while it equals to 10

            System.out.println(number + "x" + k + "=" + (number*k));

            //                      3    x   1     =     3  (result)
            k++;  // 1 +1 =2
            //                      3    x   2     =     6
        }

    }
}
