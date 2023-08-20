package day09arrays_foreach_loop;

import java.util.Arrays;

public class C02Review {

    public static void main(String[] args) {


        //Example 3: Create a String Array, add 5 elements in it, find the sum of the number of characters in all Strings


        String[] st = {"Java", "is","easy","dont", "worry"};


        int sum = 0;

      for(String w : st){

          sum = sum + w.length();
      }

        System.out.println(sum);


        //Example 4: [0, 2, 3, 0, 12, 0] put the zeros to the end ==> [2, 3, 12, 0, 0, 0]


         int[] m = {0, 2, 3, 0, 12, 0};

         int[] n = new int[m.length];

         int idx = 0;

         for(int w : m){

             if(w!=0){

                 n[idx] = w;

                 idx ++;
             }
         }

        System.out.println(Arrays.toString(n));


    }
}
