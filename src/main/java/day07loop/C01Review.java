package day07loop;

public class C01Review {


    public static void main(String[] args) {

        //Example 1:Type code to print even integers from 5 to 16 on the console


        for(int a =5; a<17; a++ ){
            if (a%2==0){
                System.out.println(a);
            }

        }

        System.out.println();

        //Homework: Type code to print odd integers from 15 to 6 on the console


        for(int b= 15; b>7; b--){

            if(b%2!=0){

        System.out.println(b);
            }
        }

        System.out.println();

        //Example 2: Type code to print integers from 5 to 16 except 7 on the console

        for(int c = 5; c<17 ; c++) {

            if (c != 7) {

                System.out.println(c);
            }

        }

        System.out.println("Example 3: ");

        //Example 3: Print String characters one by one on the console. If you see "x" stop printing
        //           "I like extra effort" ==> I like e


       String s = "I like extra effort";

       for (int d = 0; d<s.length(); d++){

           if( s.charAt(d)=='x'){

               break;
           }

           System.out.print(s.charAt(d));
       }









    }
}
