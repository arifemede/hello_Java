package day09arrays_foreach_loop;

import java.util.Arrays;

public class C03Review {

    public static void main(String[] args) {


        //Example 5: Create an integer array and print all the elements less than 5
        //           [12, 3, -3, 5, 23] ==> 3, -3


        int[] a = {12, 3, -3, 5,23};

        for(int w : a){

            if(w<5){

                System.out.println(w + " ");
            }

        }


        //Example 6: Check if a specific element exists in an array or not.

        // Interview question: do you know the mechanism of binarySearch


         int[] numbers = {3,7,1,9,20};

        Arrays.sort(numbers);

         int result = Arrays.binarySearch(numbers,1);

        System.out.println(result);


    }
}
