package day21collections;

import java.util.LinkedList;

public class C02LinkedList {

    public static void main(String[] args) {


        LinkedList<String> countries = new LinkedList<>();
        countries.add("France");
        countries.add("Italy");
        countries.add("Albania");
        countries.add("Germany");
        countries.add("Netherlands");

        System.out.println(countries);  // [France, Italy, Albania, Germany, Netherlands]


        // peek() and element() methods;

        // peek() and element() methods return first element without removing.
        // For empty list peek() method returns "null"
        // For empty list element() method throws exception. if you want to stop running code with null list, use element.=> example: at atm machine, if the account has empty (no money)

        String country1 = countries.peek(); // Retrieves, but does not remove, the head (first element) of this list. It checks the first node

        System.out.println(country1);  // France

        // After using peek, when we print the countries again we see that the list didn't change;

        System.out.println(countries); // [France, Italy, Albania, Germany, Netherlands]


        String country01 = countries.element();
        System.out.println(country01); // France
        System.out.println(countries); // // [France, Italy, Albania, Germany, Netherlands]


        // both the peek and element list did not touch the countries list.


        LinkedList<String>names = new LinkedList<>();

        System.out.println(names.peek()); // null, it gives you null at output with empty list.

       // System.out.println(names.element()); // it throws exception on the console if the list is empty .


        //pop() and poll() methods return and remove the first element.
        //For empty lists, poll() method returns "null"
        //For empty lists, pop() method throws "NoSuchElementException"

        String c = countries.pop();// This method is equivalent to removeFirst()
        System.out.println(c);// France
        System.out.println(countries);// [Italy, Albania, Germany, Netherlands]

        String d = countries.poll();// Retrieves and removes the first element of this list.
        System.out.println(d);// Italy
        System.out.println(countries);// [Albania, Germany, Netherlands]

        System.out.println(names.pop());// NoSuchElementException
        System.out.println(names.poll());// null



    }
}
