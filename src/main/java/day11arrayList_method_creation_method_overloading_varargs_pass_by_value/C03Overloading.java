package day11arrayList_method_creation_method_overloading_varargs_pass_by_value;

public class C03Overloading {


    public static void main(String[] args) {


       // add(3,5, 7); // if you use whole number java accept it as an int ==> in this code java will select second method

        add(3,5); // in this code java will use first method


    }



        // Create a method adds two integers

        public static int add(int a, int b){  // int a, int b ==> these are the parameters of this method

            return a+b;
        }

        // Create a method adds three integers

       public static int add(int a, int b, int c) {

           return a + b + c;

       }

        // Create a method adds one integer and on double

        public static double add(int a, double b) {

            return a+b;

        }

        // Create a method adds one double and one integer


         public static double add(double a, int b) {

             return a + b;


             //Note1: You can create "many method with the same name"  in a class, but method parameters must be different

             //Note2: If you create "many methods with the same name with different parameters" in a class, it is called "Method Overloading"

             //Note3: You need to make the parameters different in "method overloading"

             //      To make them different you have 3 ways;
             //                                             i) Change the number of parameters
             //                                            ii) Change the data types of the parameters
             //                                           iii) Change the places of the parameters, if the data type of the parameters are different


             //Note4: In "method overloading" you can use any access modifier - in the interview it can be asked

             //Note5: In "method overloading" you can use 'nonstatic' and 'static' as well. Being static or nonstatic does not affect "method overloading"

             //Note6: "Method Names" and "Method Parameters" are essentials in Methods. if you change the method names it will be completely different method

             //       That is why "Method Name" and "Method parameters" are the signature of the method

             //       If you want to check two methods are same or not look at just "Method Names" and "Method Parameters"

             //      "Access Modifiers", "Return Types", "Static Keyword" cannot make methods different from each other

             //Note7: Java is an "Object-Oriented Programming Language"(OOP)

             //       OOP has 4 principals; i) Inheritance
             //                            ii) Polymorphism = Method Overloading + Method Overriding
             //                           iii) Encapsulation
             //                            iv) Abstraction



           /*  public         static          int               add             (int a, int b){

            access modifier   statickeyword   return type       method name      method parameters


             } */



    }
}
