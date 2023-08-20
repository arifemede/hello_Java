package day14constructors;


/* Note1: We create parent class and put common methods into the parent class to

        i) prevent repetition
        ii)make maintenance easy
       iii)make updates easy
        iv)save time in code typing
        v) make the classes as possible as small to make them work faster


  Note2: To make a class use methods from another class, we should create "parent-child relationship" between them.

         To create "parent-child relationship" we use "extends" keyword from "child class" to "parent class"


  Note3: "public" and "protected" methods can be used(inherited) by "child classes" without any restriction

         "default" methods can be used(inherited) if the object and the parent class are in the same package

         "private" methods can not be used(inherited) by child classes.


  Note4: If a child class uses class members from parent class it is called "inheritance"


  Note5: Object-Oriented Programming Concept has 4 Principals

         a) Inheritance   b) Encapsulation     c) Polymorphism      d) Abstraction


  Note6: There are different types of Inheritance;

         i) Multiple Inheritance; Java does not support multiple inheritance

                                  Java supports "Single Inheritance"

        ii) Multilevel Inheritance: Java supports "multilevel inheritance"


        parent to child => has a relationship
                                                => both are called covariant data types
        child to parent => is a relationship














 */

public class C03Animal {

    public int age = 2;
    public String name;



    public void eat(){

        System.out.println("Animals eat...");
    }


    public void drink(){


        System.out.println("Animals drink...");
    }



}
