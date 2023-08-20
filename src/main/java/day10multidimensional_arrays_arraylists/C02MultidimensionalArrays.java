package day10multidimensional_arrays_arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class C02MultidimensionalArrays {

    public static void main(String[] args) {

        // How to create multidimensional Array

        int[][] a = new int[3][2]; // [outer array] [inner arrays] => [[0,0],[0,0],[0,0]]


        //How to print multidimensional array

        System.out.println(Arrays.deepToString(a)); // [[0,0],[0,0],[0,0]]


        //How to add elements

        a[0][1]= 3;

        System.out.println(Arrays.deepToString(a)); // [[0,3],[0,0],[0,0]]

        a[0][0]=2;

        System.out.println(Arrays.deepToString(a)); // [[2,3],[0,0],[0,0]]

        a[1][0]=5;

        System.out.println(Arrays.deepToString(a)); // [[2,3],[5,0],[0,0]]


    // Example 1: Type code to find the total number of elements in a multidimensional array


    String[][] b = {{"X","U"},{"a","d","m"},{"T"}};   // short way of creating multidimensional array list

         int sum =0;

        for(String[] w : b){  // we type string array, not multidimensional array. bcz it will get them one by one

        sum = sum + w.length;             // will give the number of element in first second and third arrays one by one.

       //sum = 0  + 2 = 2 {"X","U"}
       //sum = 2  + 3 = 5  {"a","d","m"}
       //sum = 5  + 1 =6    {"T"}
        }

        System.out.println(sum); // 6



        // Example 2: Print the elements which has "a" in it from a multidimensional array


        String[][] c = {{"Java","is"},{"easy"},{"to","learn"}}; // nested loop


        for(String[] w: c){  //{"Java","is"}

            for(String u: w){ //{"java"}

                if(u.contains("a")){ // if "java" contains 'a'

                    System.out.println(u);  // print it
                }

            }
        }


        // Example 3: Type code to find the maximum and minimum elements in a 2 dimensional integer array


        int[][] n = {{5,2}, {14,9}, {7}};

        int maximum = n[0][0]; // at the beginning the maximum element is 5

        int minimum = n[0][0];

        for(int[] w : n){   // {5,2}

            for(int u : w){  // {5} // nested loop structure for multidimensinal array

                maximum = Math.max(u,maximum); // take the int which is maximum for the values of u and maximum

           //   maximum =         5, 5 --> 5
           //   maximum =         2, 5 --> 5
           //   maximum =         14,5 --> 14
           //   maximum =         9 ,14--> 14
           //   maximum =         7, 14--> 14


                minimum = Math.min(u,minimum);


            }

        }

        System.out.println(maximum);

        System.out.println(minimum);


        // Example 4: Type code to convert a multidimensional array to a one dimensional array

        int[][] p = {{5,2}, {14,9}, {7}};   // => { 5, 2, 14, 9, -7 }


        // first I should find the number of the elements of p array;

        int ln = 0;

        for(int[] w: p){

            ln = ln + w.length;

           //ln = 0 + 2 =>2
           //ln = 2 + 2 =>4
           //ln = 4 + 1 =>5
        }

        // then we create the r array for one dimensional array;

        int[] r = new int[ln];  // ln is the number of the element in p multidimensional array . so the number of the elements in r array is 'ln'

                               // for now it is ==> {0,0,0,0,0}

        int idx = 0;

       for(int[] w: p){   // [5,2] -> [14,9] -> [-7] in loop we get the inner arrays one by one

           for(int u : w){  // 5    -> then the integers one by one

               r[idx] = u;
            // r[0] = 5;
            // r[1] = 2;
            // r[2] = 14;
            // r[3] = 9;
            // r[4] = -7;
               idx++;
           }
       }

        System.out.println(Arrays.toString(r));  // [5 , 2, 14, 9, -7]







    }
}
