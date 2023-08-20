package day07loop;

public class C07WhileLoops {

    public static void main(String[] args) {



        // ForLoop, WhileLoop, DoWhileLoop , ForEachLoop. take note for each of them

        //Example 1: Type code to print integers from 4 to 7

        //1.Way: forLoop   => it is more readable than forLoop

        for(int i=4; i<8; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //2.Way: whileLoop
        int i=4;

        while(i<8){

            System.out.print(i + " ");

            i++;

        }
    }
}
