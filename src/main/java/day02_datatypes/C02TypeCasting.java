package day02_datatypes;

public class C02TypeCasting {


    public static void main(String[] args) {


        // Type Casting: If you assign a value of a primitive data type to another primitive data type,
        // it is called typecasting



        // To put small data type into large data type is easy and Java will do it automatically
        // The name of this process is "Auto Widening"

        byte myAge = 34;

        int age = myAge;


        // To put large data type into small data type has risk that is why Java does not do it automatically
        // You have to type small data type in front of the name of the large data explicitly
        // The name of this process is "Explicit Narrowing"

        long value1 = 3400L;

        short value2 = (short)value1;



        //note: if all values are int in a mathematical operation, the result will be int as well
        //it the result is decimal in math, Java converts it to int by removing decimal part of the result

        int numOfStd = 12;
        int amountOfMoney = 500;

        System.out.println(amountOfMoney / numOfStd); // normally the result is: 41.666

                                                          // but in Java if the first and second number is int the result should be int

                                                          // that's why Java remove decimal part. the result is 41



        //Note2: if you use different data types in a mathematical operation, the result will be in the largest data type you used into operation


        int numOfStudents = 12;
        float moneyAmount = 500.0F;

        System.out.println(moneyAmount / numOfStudents); // 41.66668




        



    }

}
