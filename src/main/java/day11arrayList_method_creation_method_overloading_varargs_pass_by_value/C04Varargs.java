package day11arrayList_method_creation_method_overloading_varargs_pass_by_value;

public class C04Varargs {


    // Varargs stands for "Variable Arguments"

    // By using "Varargs", we made method work with different number arguments

    // You cannot use any parameter after "Varargs", so "Varargs" must be the last parameter in a method

    // You can use parameter before "Varargs"

    // You can use just a single varargs

    public static void main(String[] args) {


        System.out.println(add());

        System.out.println(add(5));

        System.out.println(add(4,5,6,7,3,2,7,3,6));

        // when you use vararg just a single method can handle with all scenarios with different number of arguments as above

    }



    // Create a method able to do addition with any number of parameters

    public static int add (int...a){  // after varargs you can not use second parameters. such as: (int...a, char...b)

                                      // we can not use different data types in varargs, bcz it is impossible to make full the first parameters. it means second parameters will be unreachable

                                     // So varargs must be the last parameter in your method,

                                      // but before vararg you can use: add(char a, int...a)
        int sum = 0;

        for(int w : a){

            sum= sum+w;

        }

        return sum;
    }



}
