package day21collections;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C03Sets {


    /*
        1)Sets are for storing multiple unique data ; StudentID, email address

        2)Hash: Hashing is a technique to create unique data: when you register to the university, they give you a student number with hashing technique

        3)There are 3 types of Sets: i) HashSet:
                                        a) HashSet is for storing unique data
                                        b) HashSet puts the elements in random order
                                        c) HashSet accepts null as element
                                        d) HashSet is superfast because it does not spend time on ordering elements

                                    ii) LinkedHashSet:
                                        a) LinkedHashSet is for storing unique data
                                        b) LinkedHashSet puts the elements in insertion order

                                    iii) TreeSet
                                       a) TreeSet is for storing unique data
                                       b) TreeSet puts elements in natural order(Alphabetical order for String, ascending order for numeric data)
                                       c) TreeSet is so slow because putting elements in natural order needs too much time.
                                       d) TreeSet does not accept "null" as element because "null" cannot be put in natural order

     */

    public static void main(String[] args) {


        long t1 = System.nanoTime();  // to find the execution time of hashset

        HashSet<String> emails = new HashSet<>();

        emails.add("xy@gmail.com");
        emails.add("dc@gmail.com");
        emails.add("mn@gmail.com");
        emails.add("ab@gmail.com");
        emails.add("kn@gmail.com");
        emails.add("xy@gmail.com");  // for the second same data, java does not give error but ignores it.
        emails.add(null);
        emails.add(null);
        System.out.println(emails);  // [ab@gmail.com, null, xy@gmail.com, dc@gmail.com, mn@gmail.com, kn@gmail.com] => puts the elements in the random order =>

        // if you try to add same data two times in the list, java ignore the repeated second data. and doesnt print it on the console.


        long t2 = System.nanoTime();   // to find the execution time of LinkedHashSet

        LinkedHashSet<String> ids = new LinkedHashSet<>();
        ids.add("xy@gmail.com");
        ids.add("dc@gmail.com");
        ids.add("mn@gmail.com");
        ids.add("ab@gmail.com");
        ids.add("kn@gmail.com");
        ids.add("xy@gmail.com");
        ids.add(null);
        ids.add(null);
        ids.add(null);
        System.out.println(ids);   // [xy@gmail.com, dc@gmail.com, mn@gmail.com, ab@gmail.com, kn@gmail.com, null]


        long t3 = System.nanoTime();


        LinkedHashSet<String> ssn = new LinkedHashSet<>();
        ssn.add("xy@gmail.com");
        ssn.add("dc@gmail.com");
        ssn.add("mn@gmail.com");
        ssn.add("ab@gmail.com");
        ssn.add("kn@gmail.com");
        ssn.add("xy@gmail.com");
        ssn.add("de@gmail.com");
        ssn.add("de@gmail.com");
        ssn.add("de@gmail.com");

        System.out.println(ssn);  // [ab@gmail.com, null, xy@gmail.com, dc@gmail.com, mn@gmail.com, kn@gmail.com]

         long t4 = System.nanoTime();






        // Interview question; Which data structure do you use to store unique data in natural order?
        //                     TreeSet
        //          question: But TreeSet is so slow, how do you prevent your code to be so slow?
        //                    I use HashSet to add elements then convert HashSet to TreeSet

        HashSet<String> stdId = new LinkedHashSet<>();
        stdId.add("xy@gmail.com");
        stdId.add("dc@gmail.com");
        stdId.add("mn@gmail.com");
        stdId.add("ab@gmail.com");
        stdId.add("kn@gmail.com");
        stdId.add("xy@gmail.com");
        stdId.add("de@gmail.com");
        stdId.add("de@gmail.com");
        stdId.add("de@gmail.com");

        TreeSet<String>stdIdTree = new TreeSet<>(stdId);

        System.out.println(stdId);


        long t5 = System.nanoTime();

        System.out.println("HashSet:" + (t2 - t1));

        System.out.println("linkedHashSet:" + (t3 - t2));

        System.out.println(("TreeSet:" + (t4 + t3)));

        System.out.println("HashSet + TreeSet: " + (t5 - t4));




    }
}
