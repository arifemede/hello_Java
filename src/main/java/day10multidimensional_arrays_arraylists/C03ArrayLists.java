package day10multidimensional_arrays_arraylists;

import java.util.ArrayList;

public class C03ArrayLists {

    public static void main(String[] args) {

        /*

         ArrayLists are for storing multiple data in the same data type with flexible length.


        1) It is impossible to create an Array without declaring the number of the elements in it.
        This is not good, because it is impossible to decide number of elements you will put into an array at he beginning

        Array are fixed in length, this creates issues in implementation, that is why Java created another structure
        which is flexible. Its name is "ArrayList"

        Arrays use "primitive" and references in data types but ArrayLists use just non-primitives

        Why didn't Java remove Arrays after creating ArrayLists?
        Because i) Arrays are so fast   ii) Arrays use memory so less

        So if the length is clear, and you are sure the length will not change later
        For instance: the days of the week , months ...


        ArrayLists are for storing multiple data in the same data type with flexible length.
        ArrayList do not accept primitive data types in elements, you have to use non-primitive data types



       */

        // How to create an ArrayList

        ArrayList<Integer> m =new ArrayList<>();

        // How to print ArrayLists

        System.out.println(m);  // []

        // How to add elements int a ArrayList (List)

        m.add(12);
        System.out.println(m); // [12]

        m.add(5);  // add() methods adds the elements to the end
        System.out.println(m); // [12, 5]

        m.add(1,3); // put the element 3 in the index 1 => add(index,element)

                                // [12, 3, 5]





        ArrayList<Integer> n = new ArrayList<>();

        n.add(99);
        n.add(88);
        n.add(77);
        System.out.println(n);  // n = [99, 88, 77]

        m.addAll(n); // get all the element in the n, put to the n
        m.addAll(2,n);
        System.out.println(m); // [12, 3, 99, 88, 77, 5, 10, 9, 99, 88, 77]



        // Example 1: Create an Integer ArrayList and change the odd ones to 11

        ArrayList<Integer> p = new ArrayList<>();

        p.add(23);
        p.add(24);
        p.add(12);
        p.add(9);
        p.add(3);

        System.out.println(p); // [23, 24, 12, 9, 3]

        for(Integer w : p){  // this part is not changing , same always

            if(w%2!=0){  // 23%2!=0
                         // 24%2!=0
                         // 12%2!=0
                         // 9%2!=0
                         // 3%2!=0

                p.set(p.indexOf(w),11);   // set method it is used to update the list => it changes odd numbers with 11


            }

        }

        System.out.println(p); // [11, 24, 12, 11, 11]\



        // Example 2: Create a String ArrayList and Remove the elements contain a


        ArrayList<String> r = new ArrayList<>();

        r.add("Miami");
        r.add("New York");
        r.add("Tampa");
        r.add("Virginia");

        System.out.println(r); // [


        for(int i=0; i<r.size(); i++) { // we use size for ArrayList to get the number of the elements

          String city = r.get(i); // go to list class and ...

           if(city.contains("a")){

                r.remove(city); // Removes the first occurrence of the specified element from this list,

              //  r.remove(i); // Removes the element at the specified position in this list.

                i--;  //if the condition is true, the length of list decrease (bcz we remove the element which includes a), so we do decrement in i as index
            }

        }

        System.out.println(r); // [New York]






    }
}
