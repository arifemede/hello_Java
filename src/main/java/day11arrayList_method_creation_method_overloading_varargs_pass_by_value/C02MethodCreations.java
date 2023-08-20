package day11arrayList_method_creation_method_overloading_varargs_pass_by_value;

public class C02MethodCreations {

    public static void main(String[] args) {



        // METHOD CALL : Using a method in "main" method is called "Method Call"

        int r1 = add(3,5);  // values used in method call is called arguments
        System.out.println(r1);


        double r2 = multiple(1.2,4,5.31);
        System.out.println(r2);


        String r3 = joinStrings("Ali ", "Veli");
        System.out.println(r3);

    }


    // METHOD CREATION


    public static int add(int a, int b){

        return a+b;

        // this is method

    }

    // Create a method to multiple 3 numbers


    public static double multiple(double c, double d, double e){  // variables used in method creation are called "Parameters"

       return c*d*e;
    }

    // Create a method joins two strings

    public  static String joinStrings(String m, String n){

        return m.concat(n); // it is same with m+n;
    }


    // Using a method in "main" method is called "Method Call"
    // values used in method call is called "Arguments"



}
