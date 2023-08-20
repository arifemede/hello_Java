package day03_Scanner_Concatination;

public class C08IncrementDecrement08 {

    public static void main(String[] args) {


        //Increment meant to increase value of a variable

        int age = 13;

        // Example; facebook use increment coding to update your age according to your birthday

        // 1.Way:

        age = age+2;

        System.out.println(age); // 15

        age += 2;  // new value of age is 15, 15 +2 is 17

        System.out.println(age);  // 17


        // Increment can be done by multiplication as well

        //1.Way:

        age = age*2;    // this way is more readable so we use this one

        System.out.println(age); //34


        age *= 2;
        System.out.println(age); //68


        // Syntax used just to increase by 1

        age++;
        System.out.println(age); // 69  ==> '++'' it is used to increase just 1 not more


        age = age-2;
        System.out.println(age); // 67


        age -= 2;
        System.out.println(age); //65


        //Decrement can be done by division as well

        age = age/5;
        System.out.println(age); //13


        age /= 13;
        System.out.println(age); //1


        //Syntax used to decrease by 1

        age--;
        System.out.println(age); //0



    }


}
