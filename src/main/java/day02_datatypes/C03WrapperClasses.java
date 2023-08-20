package day02_datatypes;

public class C03WrapperClasses {


    public static void main(String[] args) {


        // Wrapper Classes: Java created a new data structure by adding some useful methods to primitive data types.


        // Java created 'wrapper class' for every primitive data type


        /*
         Primitive          Wrapper Class

         byte    ==>            Byte
         short   ==>            Short
         int     ==>            Integer
         long    ==>            Long
         float   ==>            Float
         double  ==>            Double
         boolean ==>            Boolean
         char    ==>            Character

        */

         Integer age = 35;

         // Following one is primitive it does not have any method

        int weight = 25;


        // If you use wrapper class name, you will be able to use more methods . this is the benefit of wrapper class


        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);



        // Find the min and max value of short data type

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);



        // How to convert "primitive" to "wrapper" ==> Autoboxing

        char ch = '?';

        Character chWrapper = ch; // Autoboxing


        // How to convert "wrapper" to "primitive" ==> Unboxing

        Boolean b1 =true;

        boolean b2 =b1;






    }
}
