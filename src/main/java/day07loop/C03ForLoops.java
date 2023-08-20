package day07loop;

public class C03ForLoops {

    public static void main(String[] args) {

        /*
            Example 7: Type code to print the following image on the console (Nested For Loop)=>interview question
            X X X
            X X X

       */

        int row = 2;
        int column = 3;

        for(int i=1; i<=row; i++){

        //  for first row I am starting i=1 = >

        //  to go from 1 to 2(row)

            String s = "";

            for(int k=1; k<=column; k++){
                s = s + "X ";
            }

            System.out.println(s);

        }

    }
}
