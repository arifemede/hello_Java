package day10multidimensional_arrays_arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C04ArrayLists {

    public static void main(String[] args) {


        // Example 3: Create a character list which has repeated elements then remove the duplicates
        //            [J,a,v,a,c] ==> [J,a,v,c]


        List<Character> a = new ArrayList<>();

        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('c');

        List<Character> b = new ArrayList<>(); // I create new list to put new list in it

        for(Character w : a) {

            if (!b.contains(w)) { // b doesnt contain the elemnent w

                b.add(w); // add the element w to b list

            }
        }
        System.out.println(b);


        // Example 4: Find the closest 2 integers in the given list

        //            [20,15,14,11,19] ==> 14-15, 19-20

        List<Integer> p = new ArrayList<>();

        p.add(20);
        p.add(15);
        p.add(14);
        p.add(11);
        p.add(19);




    }
}
