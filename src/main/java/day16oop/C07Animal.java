package day16oop;

/*

 1) If a method has method body it is called "concrete method"

    If a method does not have method body it is called "abstract method"

 2) To make a method abstract

    i) Remove method body
    ii)Use "abstract" keyword between "access modifier" and "return type"
   iii)Make the class abstract as well
       because abstract methods can be put onto abstract classes

 3) When you create an abstract method, all the concrete child classes must override the abstract method

 */

public abstract class C07Animal {   // I made the class itself abstract. Bcz abstract method can be put into abstract class


    public abstract void eat();  // normally we can not create method without body, but with abstract keyword, we can do it.



}
