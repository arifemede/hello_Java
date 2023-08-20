package day22collections_maps;

import java.util.Arrays;
import java.util.HashMap;

public class C03Maps {

    public static void main(String[] args) {

        //Example 1: Type code to find the number of occurrences of words in a sentence =>  very common interview question
//           Java is easy, Java is OOP, OOP makes Java easy. ==> Java=3, is=2, easy=2, oop=2, makes=1


        String s = "Java is easy, Java is OOP, OOP makes Java easy.";

        // To make "easy," and "easy." same remove all punctuation marks

        s.replaceAll("\\p{Punct}", "");   // make all punctuation marks nothing

        System.out.println(s);


        // Create a map =>  Bcz the output will be key-value structure

        HashMap<String,Integer> occ = new HashMap<>();  // I create an empty map {          }



        // Get the words from the String by using split(" ")

        String[] words = s.split(" "); // by using this code I created array list
        System.out.println(Arrays.toString(words));

        // Put the words in the map by counting

        for (String w : words){

            Integer numOfcc = occ.get(w); //

            if(numOfcc == null){  // // assignment operator will put null on the numOfcc container

                occ.put(w,1);

            }else {
                occ.replace(w, numOfcc+1);
            }


        }

        System.out.println(occ);

    }
}
