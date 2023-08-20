package day20exceptions;

import java.util.ArrayList;
import java.util.List;

public class NameRunner {

    public static void main(String[] args) throws IllegalNameException {


        System.out.println(addNames("Marry"));

        System.out.println(addNames("12John")); // this is not valid name, my code should throw exception for it/


    }


    // Create a method to add names into a list

    public static List<String> addNames(String name) throws IllegalNameException {

        List<String>namesList = new ArrayList<>();

        if(name.charAt(0)>64 && name.charAt(0)<123){  // ASCII values of upper and lower cases => I put my ow special exception cases

            namesList.add(name);
        }else{

            throw new IllegalNameException("Initial of a name must be uppercase..");
        }

        return namesList;

    }


}
