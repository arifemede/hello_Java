package groupstudy;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {

    public static void main(String[] args) {


        // Calculate the product of the first 12 numbers

        int result = 1;

        for(int i=1; i<13; i++){

            result*=1; // result = result*i;

        }

        System.out.println(result);


        // Remove all elements in ArrayList A which are less than 10

        ArrayList<Integer> A = new ArrayList<>();

        A.add(8);
        A.add(12);
        A.add(54);
        A.add(4);
        A.add(87);

        for(int i=A.size()-1; i>=0; i--) {

            if (A.get(i)<10) {
                A.remove(i);
            }
        }

        System.out.println(A);




        // Check if an array A of integers is sorted from smallest to largest

        boolean r1 = true;

        int p [] = {2,65,86,32};

        for (int i=1; i<p.length; i++ ){

            if(p[i]<p[i-1]){

                r1=false;
            }

        }
        System.out.println(r1);




    }
}
