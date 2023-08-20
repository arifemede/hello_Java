package day03_Scanner_Concatination;

public class C07Operators07 {

    public static void main(String[] args) {


        // "=" ==> Assignment Operator ==> Takes the value from the right then puts it into the container on the left

        // "==" ==> Equality Operator ==> Checks if the value on the left is the same with the value on the right

        //          2+3==5 ==> true       2+4==3 ==> false  so "==" in Java returns "boolean"

        //          'A'==65==> true      if you use char with any mathematical operation Java uses the ASCII value of the char


        System.out.println('A'==65);

        System.out.println('A' + 'a'); // 162 ==> Because, I used char with addition operation so Java used the ASCII value of the char


        // Example; Find ASCII value of "!" by typing code

        System.out.println('!'*1); // 33  ==> it gives ascii value when you use mathematical operation


        // "!" ==> Not Operator ==> !true=false    !false=true    !!true=true

        // "!=" ==> Not Equals Operator
        //          2+3!=7 ==> true      3+4!=7 ==> false

        // "<" , ">", "<=" , ">=" return boolean

        /*

          "==" with Strings
          Every String has two main things i)Value ii)Address

         */


        String s1 ="Tom";
        String s2 = "Hanks";
        String s3 = "Tom";
        String s4 = new String("Tom");

        System.out.println(s1==s2); // false

        System.out.println(s1==s3);  // true

        System.out.println(s1==s4);  // false => bcz the address is different. they are stored in different address in stack memory

        // how to check just value by ignoring addresses;

        System.out.println(s1.equals(s4)); // it will check just the values in String

        // when you use "==" java check both; addresses and values
        // if you use "equals" java check just the value.

        // when we compare two strings we use ".equals" method. this is very important







    }

}
