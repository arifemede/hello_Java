package day16oop;

/*
  1) The method on child class(Overriding Method) can not have narrower
     access modifier than the method in parent class(Overridden Method)

     Overridden Method ==> Default
     Overriding Method ==> default, protected, public  => this must be same or wider


     Overridden Method ==> protected
     Overriding Method ==> protected, public


     Overridden Method ==> private
     Overriding Method ==> private methods cannot be overridden, bcz to override the method I have to access the method

     2)Polymorphism = Method Overloading(static polymorphism) + Method Overriding(dynamic polymorphism)

     3) Very common interview question;

     What is the difference between method overloading and method overriding;

     i) method overloading occurs in a single class, method overriding needs multiple classes.

    ii) method overriding needs inheritance, method overloading does not

   iii) "private" methods can be overloaded, but private methods can not be overridden

    iv) In Method Overloading we change method signature, but in method overriding we do not change method signature

    v) In Method Overloading access modifier and return types do not take any role
       but in Method Overriding there are some rules to change access modifiers and return types

   vi) In Method Overloading we change the parameters and make the method work with different scenarios.
       In Method Overriding we make the method implementation more specific for the child class

   vii) static methods can be overloaded but can not be overridden.

 */


public class C01Animal {


    public void eat(){

        System.out.println("Animals eat...");

    }



}
