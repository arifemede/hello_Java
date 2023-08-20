package day08while_loop_do_while_loop;

public class C01WhileLoops {

    public static void main(String[] args) {


        //Example 1: Type code to print even integers from 13 to 8 on the console.


        int i=13;  // starting value

        while(i>7){   // ending value

            if(i%2==0){  // if it is even integer
                System.out.print(i +" ");    // print i
            }

            i--;
        }
        /*
            Note: "Infinite Loop" is a risk in using loops.
                  If you forget to type "increment or decrement part" in loops, you will have "infinite loop" and Java will stuck over there
                  it means your application will freeze.
                  If you type "increment or decrement part" wrongly in loops, you will have "infinite loop" and Java will stuck over there
                  it means your application will freeze.
         */

        System.out.println();

        //Example 2: Type code to check if a given integer is palindrome or not  => palindrome means the number is equals to its reverse
        //           Palindrome: 121 <==> 121        123321 <==> 123321

        int k = -121;

        k = Math.abs(k);  // if the given data is negative, we must do it positive

        String m = String.valueOf(k);  // we convert integer k  to string m  ==> m = "1215"

        String reversed = "";  // when I reverse m , it will be new data. I need new container to put the new data in it

        int n = m.length()-1;  // last index of the string . this is starting value

        while(n>=0){   // this is ending value. bcz it is reversed, ending value is the first char of string

            reversed = reversed + m.charAt(n);
            n--;
        }
        System.out.println(reversed);

        // after finding the reverse of string; we will check if the original value is same with its reverse

        if(m.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
