package replit_questions;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        /*Ask user to their weight and height and type a program with calculates mass index

                * HINT : Body Mass Index = Weight (kg) / Square of height (m)

                Then give a message to user as following:

        If BMI is less than 18.5 , you re weak
        If BMI is between 18.5 and 25 , your weight is ideal
        If BMI is between 25 and 30, you re fat
        If BMI is more than or equal to 30, obese

          */


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your weight and heigth please");

        double weight = scan.nextDouble();

        double height = scan.nextDouble();

        double BMI = weight / (height*height);

        System.out.println("Your weight: " + weight);

        System.out.println("Your height: " + height);

        if(BMI<18.5){
            System.out.println("Your BMI is: " + BMI + "You are weak");
        } else if (BMI>18.5 && BMI<26) {
            System.out.println("Your BMI is: " + BMI + "your weight is ideal");
        } else if (BMI>25 && BMI<30) {
            System.out.println("Your BMI is: " + BMI + "You are fat");
        } else if (BMI>=30) {
            System.out.println("Your BMI is: " + BMI + "you are obese");
        } else {
            System.out.println("Invalid number");
        }


    }
}
