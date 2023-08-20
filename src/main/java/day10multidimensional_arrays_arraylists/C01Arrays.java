package day10multidimensional_arrays_arraylists;

import java.util.Arrays;

public class C01Arrays {

    public static void main(String[] args) {

        // Note: split() method in String Class returns Array

        String s ="Learn Java earn money";

        String[] t = s.split("a");

        System.out.println(Arrays.toString(t)); // [Le, rn J, v, e, rn money]

        // Note 2: equals() method is used to check if two arrays are "same" (Elements and the order are the same) or not

        int[] a = {2,5,1};
        int[] b = {2,5,1};

        boolean u = Arrays.equals(a,b);

        System.out.println(u); // true




    }
}
