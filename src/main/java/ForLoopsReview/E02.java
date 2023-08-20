package ForLoopsReview;

public class E02 {

    public static void main(String[] args) {


        //Example 4: Type code to reverse a String (Interview Question)
        //           Alexa ==> axelA


        String name = "Alexa";

        String reversedName = "";

        for(int i =name.length()-1; i>=0; i--){

            reversedName = reversedName + name.charAt(i);

        }

        System.out.println(reversedName);

        //Example 5: Type code to find the sum of the digits in an integer
        //           587 ==> 5+8+7 = 20













    }
}
