package day09arrays_foreach_loop;

import java.util.Arrays;

public class C02ArraysInterview {

    public static void main(String[] args) {

        //Example 3: Create a String Array, add 5 elements in it, find the sum of the number of characters in all Strings


        String[] cities = {"Miami", "Alabama", "Jacksonville", "Tampa", "Orlando"};

        int sum = 0; // I created a new memory for sum of characters

        for(String w : cities){
            sum = sum + w.length();

         //       0   + miami.length =>5
         //       5   + alabama.length => 12
         //      12   + Jacksonville => 24

        }
        System.out.println(sum);

        //Note 1: Arrays can contain just "primitive data types" and "references"
        //Note 2: Strings use "length() method", Arrays use "length variable"



        //Example 4: [0, 2, 3, 0, 12, 0] put the zeros to the end ==> [2, 3, 12, 0, 0, 0]

        //(interview question)

        int[] m = {0, 2, 3, 0, 12, 0};

        int[] n = new int[m.length]; // new array for new array list
               // I type [m.length] inside the array parentheses to make my code dynamic

        int idx = 0;
        // [0, 2, 3, 0, 12, 0]
        for(int w : m){

           // w has 0 in w;
           // w has 2 in w; check the condition; if(w!=0)

            if(w!=0){  // if w is not 0
                n[idx] = w;   // put it into the new array

              //n[0] =2
              //n[1] =3
              //n[2] =12
                idx++;   // index of elements in array will increase until the length of m equal to idx
            }
        }
        System.out.println(Arrays.toString(n));// [2, 3, 12, 0, 0, 0]
    }
}
