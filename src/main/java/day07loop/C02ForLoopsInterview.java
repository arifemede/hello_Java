package day07loop;

public class C02ForLoopsInterview {

    public static void main(String[] args) {

        //Example 4: Type code to reverse a String (Interview Question)
        //           Alexa ==> axelA

        String s = "Alexa";
        String reversed = "";

        for(int i=s.length()-1; i>=0; i--){
            reversed = reversed + s.charAt(i);

        }
        System.out.println(reversed);



        //  reversed = " "  + a   ==> starts from the value of i is s.(length)-1 => it means number of last char of string  => 4
        //  reversed = " a " + x  ==>                                            => 3
        //  reversed = " ax" + e                                                 => 2
        //  reversed = "axe" + l                                                 => 1
        //  reversed = "axel" + A                                                => 0 (first char of string)
        //  reversed = "axelA


        System.out.println("   ");

        //Example 5: Type code to find the sum of the digits in an integer
        //           587 ==> 5+8+7 = 20

        int num = -587;
        num = Math.abs(num);  // to make all the values positive, we use Math.abs(num) method

        int sumOfDigits = 0;  // we create a new container for our new data which we will have after loop

        for(int i=num; i>0; i=i/10){
            sumOfDigits = sumOfDigits + i % 10;

        //     0       =     0      +  i % 10 => 587%10  => 7
        //     7       =     7      +  i % 10 => 58%10 => 8
        //     15      =    15      +  i % 10 => 5
        //     sumOfDigits = 20

        }
        System.out.println(sumOfDigits);//20

        //Example 6: Type code to find unique characters in a String
        //           Hello ==> Heo

        String t = "abbc";
        String unique = "";  // I make it empty string at the beginning

        for(int i=0;                i<t.length();                       i++){

        //starts from first char 0 ; 0<4 (bcz length of string is 4)  ; increase the value

            char ch = t.charAt(i);  // we create char container to get the chars one by one

            if(t.indexOf(ch) == t.lastIndexOf(ch)){

          // if indexOf (a) == lastIndexOf(a) ==> it means a is unique character .
                unique = unique + ch;   // add 'a' to unique container . then continue to loop for other characters

             //   ""   = " "  + a  ==> new value of unique a
            }
        }
        System.out.println(unique);

    }
}
