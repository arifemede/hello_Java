package day16oop;

/*
 Encapsulation: It means "data hiding"

 Why do you need to hide data?
i) Because some data should not be public like ID

ii)Because we do not want some data to be accessible from the other classes

How do you do encapsulation?

To hide data I use private access modifiers

Note : set and get methods are called "Java Beans"


 */


public class C05Student {

 private String stdId = "TH001";// by using private access modifier I encapsulated stdId data

 private String illness = "Depression";

 private double gpa = 3.98;

 private boolean disability = false;


 // How to read encapsulated data even we do not see them;

 public String getStdId(){  // itshould start withget,

    return stdId; // return the value of stdId
 }


 public String getIllness(){

  return illness;   // by the help of this method I will be able to read the value illness with depression
 }

 public double getGpa() {   // we did them with short way:  generate ==> getter
  return gpa;
 }

 public boolean isDisability() {
  return disability;
 }


 // How to update encapsulated data even we do not see them

 // get() methods are called getter

 public void setStdId (String stdId){  // method name should start with set => setStId

           // I will give a new value to setStId , the method (stdId) will get new value and put it into the existing container

            this.stdId = stdId;

 }

 public void setIllness(String illness) {    // right click => generate  => setter
  this.illness = illness;
 }



}
