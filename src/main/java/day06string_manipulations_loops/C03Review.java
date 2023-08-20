package day06string_manipulations_loops;

public class C03Review {

    public static void main(String[] args) {


 /*
        Example 4:Check if a password has the following conditions
        i)It should not be empty
        ii)It should not be just a space
        iii)It should not have spaces at the beginning and at the end
        iv)'i' should be a character in the password and first occurrence of 'i' should be at index 4
        v)'K' should be a character in the password and last occurrence of 'K' should be at index 5


        */


        String pwd = "A11LiK";

        boolean isEmpty = pwd.isEmpty();

        boolean isBlank = pwd.isBlank();

        boolean isTrim = pwd.trim().equals(pwd);

        boolean iChar = pwd.indexOf("i")==4;

        boolean kChar = pwd.lastIndexOf("K")==5;


        if(!isEmpty && !isBlank && isTrim && iChar && kChar){
            System.out.println("Valid Password");
        }
        if(isEmpty){
            System.out.println("The password should not be empty");
        }
        if(isBlank){
            System.out.println("The password should not be blank");
        }
        if(!isTrim){
            System.out.println("It should not have spaces at the beginning and at the end");
        }
        if(!iChar){
            System.out.println("'i' should be a character in the password and first occurrence of 'i' should be at index 4");
        }
        if(!kChar){
            System.out.println("'K' should be a character in the password and last occurrence of 'K' should be at index 5");
        }









    }
}
