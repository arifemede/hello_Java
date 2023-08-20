package day10multidimensional_arrays_arraylists;

import java.util.Arrays;

public class C02Review {

    public static void main(String[] args) {



        // How to create a multidimensional arrays

        String[][] m = new String[3][3];  // [][]length

        System.out.println(Arrays.deepToString(m));

        m[0][2] = "Ali";   // [][] index

        System.out.println(Arrays.deepToString(m));



        // Example 1: Type code to find the total number of elements in a multidimensional array


        String[][] b = {{"X","U"},{"a","d","m"},{"T"}};

        int sum = 0;

        for( String[]w : b){

            sum = sum + w.length;

        }

        System.out.println(sum);


        // Example 2: Print the elements which has "a" in it from a multidimensional array

        String[][] n = {{"ar","el"},{"del","kal"},{"gel"}};

        for(String[]a:n){

            for(String c : a){


                if(c.contains("a")){


                    System.out.println(c);
                }
            }
        }


        // Example 3: Type code to find the maximum and minimum elements in a 2 dimensional integer array


        int[][] i = {{2,4},{7,9}};

        for(int[]a:i){
            
        }




    }
}
