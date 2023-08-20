package questionBank;

import com.sun.jdi.Value;

public class StringManipulations3 {


    public static void main(String[] args) {



        // Example : Type code to check if a String has a specific single character or not in three different ways



        // 1. way:

        String s = "Hayat";

        Boolean hasChar = s.length()==s.replaceAll("y","").length();

        System.out.println("has a character 'y': " + !hasChar);


        // 2. way

        Boolean result = s.contains("y");

        System.out.println("Does the character exist?" + result);


        // 3. way

        Boolean result1 = s.indexOf("y")>0;

        System.out.println("Does the char exist? " + result1);





        // Example: Type code to find the sum of the shirt and book prices.

        String shirtPrice = "$12.99";

        String bookPrice = "$35.99";


       String newShirt = shirtPrice.replaceAll("[$.]","");

       String newBook = bookPrice.replaceAll("[$.]","");


      double priceShirt = Double.valueOf(newShirt);

      double priceBook = Double.valueOf(newBook);

        System.out.println("Total price of book and shirt: " + "$" + (priceBook+priceShirt)/100);












    }
}
