package day09arrays_foreach_loop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01Review {

    public static void main(String[] args) {

        //Example 1: Create an integer array, then find the multiplication of all elements

        int[] a = new int[3];

        a[0] = 2;
        a[1] = 3;
        a[2] = 4;

        System.out.println(Arrays.toString(a));

        int multiplication = 1;

        for (int i = 0; i < a.length; i++) {

            multiplication = multiplication * a[i];

        }

        System.out.println(multiplication);


        int result = 1;

        for (int w : a) {

            result = result * w;

        }

        System.out.println(result);


        //Example 2: Find the difference between maximum and minimum value of array elements
        //           [8, 12, 34, 10, 78, 19]  ==> 78 - 8 = 70


        int[] c = {8, 12, 34, 10, 78, 19};

        Arrays.sort(c);

        System.out.println(Arrays.toString(c));

        int min = c[0];

        int max = c[c.length-1];

        System.out.println(max-min);





    }

}
