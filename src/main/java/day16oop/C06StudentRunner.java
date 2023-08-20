package day16oop;

public class C06StudentRunner {

    public static void main(String[] args) {




       // std. =>  you can not see the methods in student class. bcz they are encapsulated with private access modifier

        //  How to read encapsulated data even we do not see them;

        // after typing this code in StudentClass: public String getStdId(){
        //
        //                                          return stdId;


        C05Student std = new C05Student();

        System.out.println(std.getStdId());  // TH001 // I can not see this variable, but by the help of get method I am able to read data.


        System.out.println(std.getIllness());



        std.setStdId("AC123");


        std.setIllness("Headache");


        // After assigning a new value the original value itself is not changing



    }


}
