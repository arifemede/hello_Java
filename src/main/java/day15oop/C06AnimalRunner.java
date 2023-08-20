package day15oop;

public class C06AnimalRunner {

    public static void main(String[] args) {


        // I will run the codes in the package from the main method


        // I will create dog object, then I will see which constructors are used to create this object

        C01Animal myDog = new C02Mammal();

        myDog.eat();



       // if you want to understand which value will come from this code, you will look data type of the object



        // Normally dog class has two parameters. I did not put any parameters here

                                    // when I type this C03Dog I say: go to dog class, use the constructor without parameters

                                   // thats why java will go first constructor, then it will go the parent class and the constructor without parameter, and again other parent class for constructor without parameter

                                   // that is why when we type this code the output will be: no parameter(the constructor without parameter from dog class)
        //                                                                                   no parameter("                      "from mammal class)
        //                                                                                   no parameter("                       "from animal class)  on the console


        // Every parameter have 'super' keyword inside the constructor ==> Mammal(){super} ==> super means parent

        // if you put parameters inside the parantesis, java will go second cosntructor in dog class. but when you dont type java go super class(parent constructor)




        // Now I want to create a dog object by using different constructors:






    }


}
