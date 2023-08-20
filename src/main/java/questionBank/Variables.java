package questionBank;

public class Variables {

    public static void main(String[] args) {


        // Create double variables for the prices of any 3 items.
        // Print the sum of the prices on the console with a label


        double bag = 2.50;

        double tShirt = 3.50;

        double shoes = 4.50;

        System.out.println("bag: " + bag);

        System.out.println("tShirt: " + tShirt);

        System.out.println("shoes: " + shoes);

        System.out.println("total price: " + bag+tShirt+shoes);


        // Create a float variable, a long variable, and an integer variable for any 3 items.

        // Print the multiplication of the value on the console with a label.

        float f1 = 109.99F;

        long l1 = 13L;

        int i1 = 3;

        System.out.println(" f1 * l1 * i1: " + (f1*l1*i1));



        // Type a code to find simple interest

        // Note interest formula= principal*rate*numberOfYear/100

        int principal = 2, rate=3, numberOfYear=10;

        int simpleInterest = principal*rate*numberOfYear/100;

        System.out.println("simple Interest: " + simpleInterest);



        // Create a String and two Long variables.
        // Print the sum and the multiplication of the long variables with the String on the console

        String s1 = "The result is: ";

        Long L1 = 13L;

        Long L2 = 12L;

        System.out.println(s1 +  (L1*L2));

        System.out.println(s1 + (L1 + L2));


        //Create two boolean variables whose are different
        //
        // and print their values in the same line with a space between two consecutive values


    }
}
