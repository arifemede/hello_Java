package day09arrays_foreach_loop;

import java.util.Arrays;

public class C03ArraysInterview {

    public static void main(String[] args) {


        //Example 5: Create an integer array and print all the elements less than 5
        //           [12, 3, -3, 5, 23] ==> 3, -3


        int[] numbers = {12, 3, -3, 5, 23};

        for(int w : numbers){
            if(w<5){   // if w is less than 5;
                System.out.print(w + " ");   // print it.
            }
        }

        //Example 6: Check if a specific element exists in an array or not.

        // Interview question: do you know the mechanism of binarySearch

        int[] nums = {12, 3, 14, 5, 23};

        Arrays.sort(nums);   // [3, 5, 12, 14, 23] => we have to use sort method before binary

        int result = Arrays.binarySearch(nums, 5); // binarySearch() method gives you the index of the existing element

        System.out.println(result);

        //      binarySearch will come to element in the middle, (to 12 in this example)

        //       then eliminate the elements on the right  [3, 5, 12, 14, 23] 14 and 23 in this example

        //      then comes the element in the middle again (5) ; then eliminate on the right (12)

        //      then


        //       binarySearch() method cannot be used with repeated elements
        //       *** Before using binarySearch() method, you have to use sort()

        int r = Arrays.binarySearch(nums, 11);

        System.out.println(r);// -3 ==> "-" means "does not exist"
        //        "3" means if it exists it would be 3rd element in the sorted array


    }
}
