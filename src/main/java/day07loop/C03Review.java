package day07loop;

public class C03Review {

    public static void main(String[] args) {


         /*
            Example 7: Type code to print the following image on the console (Nested For Loop)=>interview question
            X X X
            X X X
       */


           int row = 2;

           int column = 3;

           for(int i =1; i<=row; i++){


               String s = "";

               for(int k= 1; k<=column; k++){

                   s = s + "X";

               }

               System.out.println(s);
           }





    }

}
