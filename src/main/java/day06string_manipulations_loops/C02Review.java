package day06string_manipulations_loops;

public class C02Review {

    public static void main(String[] args) {


           // Example 3: Type code to print just the unique characters in a String

           //           "Hello" ==> Heo


            String s = "Hello";

            int indexOfH = s.indexOf("H");

            int lastIndexOfH = s.lastIndexOf("H");

            if(indexOfH==lastIndexOfH){
                System.out.print("H");
            }

            int indexOfe = s.indexOf("e");

            int lastIndexOfe = s.lastIndexOf("e");

            if (indexOfe==lastIndexOfe){
                System.out.print("e");
            }

            int indexOfl = s.indexOf("l");

            int lastIndexOfl = s.lastIndexOf("l");

            if (indexOfl==lastIndexOfl){
                System.out.print("l");
            }


            int indexOfo = s.indexOf("o");

            int lastIndexOfo = s.lastIndexOf("o");

            if (indexOfo==lastIndexOfo){
                System.out.print("o");
            }





    }
}
