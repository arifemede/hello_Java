package day22collections_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02Maps {


    public static void main(String[] args) {


         // In maps there are 2 parts: key and value

        // 'Key' part can not have repeated data , it is unique

        // 'Value' part can have repeated data , it is not unique

        // When you talk about maps, use 'entry' keyword for data

        /*   cat = pet
             dog = pet
             lion = wild => this an entry => all entries are called 'entry set'

         */


        // There are 3 maps ; hashmap , hashtable,

        // to create hashmap;

        HashMap<String, Integer> stdAges = new HashMap<>();

        // To add entries into a Hashmap

        stdAges.put("Tom",76);
        stdAges.put("Angelina",55);
        stdAges.put("Brad",61);
        stdAges.put("Leo",43);
        stdAges.put("Linda",23);
        stdAges.put("Brad", 34);

        System.out.println(stdAges); // {Tom=76, Angelina=55, Leo=43, Brad=34, Linda=23} it puts the entries into random order


        // How to work with just keys

        // Example 1: Get the total number of characters in students names.

        Set<String> keys = stdAges.keySet(); // we use keySet method, to get all the keys

        // if you work just with keys you can use keySet method to get all keys

        System.out.println(keys); // [Tom, Angelina, Leo, Brad, Linda]


        int numOfChars = 0;

        for(String w:keys){

            numOfChars = numOfChars+w.length();

        }

        System.out.println(numOfChars);


        // How to work with just values

        // Example 2: Find average age of the students


        Collection<Integer> ages = stdAges.values();
        System.out.println(ages);  // it will give me all the ages  => [76, 55, 43, 34, 23]


        double sumOfAges = 0;

        for(Integer w: ages){

             sumOfAges = sumOfAges + w;

        }

        System.out.println("Average age is: " + sumOfAges/ages.size());  // 51.6


        // How to loop with entries

        // Example 3: Find the sum of the number of character and the age for every entry

        Set<Map.Entry<String, Integer>> entries = stdAges. entrySet();

        for(Map.Entry<String, Integer> w : entries) {

            int sum = w.getKey().length() + w.getValue();

            System.out.println("For : "  + w.getKey() + ": " + sum);  // For : Tom: 79
           //                                                            For : Angelina: 63
           //                                                            For : Leo: 46
          //                                                             For : Brad: 38
          //                                                             For : Linda: 28



            int age1 = stdAges.get("Angelina");
            System.out.println(age1);


            stdAges.putIfAbsent("Angelina", 67);
            stdAges.putIfAbsent("Carl", 16);
            System.out.println(stdAges);

            stdAges.replace("Angelina", 67);//To update values by using keys use replace() method, not put()
            System.out.println(stdAges);// {Tom=76, Angelina=67, Leo=43, Carl=16, Brad=34, Linda=23}

            stdAges.replace("Angelina", 44, 100);
            System.out.println(stdAges);// {Tom=76, Angelina=67, Leo=43, Carl=16, Brad=34, Linda=23}

            stdAges.replace("Angelina", 67, 100);
            System.out.println(stdAges);// {Tom=76, Angelina=100, Leo=43, Carl=16, Brad=34, Linda=23}

            boolean r1 = stdAges.containsKey("Brad");
            System.out.println(r1);//true

            boolean r2 = stdAges.containsKey("XXXXXX");
            System.out.println(r2);//false

            boolean r3 = stdAges.containsValue(51);
            System.out.println(r3);//false

            System.out.println(stdAges.getOrDefault("Tom", 0));//76
            System.out.println(stdAges.getOrDefault("Xyz", 0));//0

            stdAges.remove("Tom");
            System.out.println(stdAges);// {Angelina=100, Leo=43, Carl=16, Brad=34, Linda=23}

            stdAges.remove("Leo", 43);
            System.out.println(stdAges);// {Angelina=100, Carl=16, Brad=34, Linda=23

        }

    }
}
