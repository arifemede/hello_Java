package questionBank;

public class StringManipulations4 {

    public static void main(String[] args) {


        // Type code to get initials of the first name and last name of a given name.
        // Middle name is out of scope

        String name = "Tom Hanks";

        String firstInitial = name.substring(0,1);

        String lastInitial = name.split(" ")[1].substring(0,1);

        System.out.println( firstInitial + lastInitial);



        // Type a code to find the number of punctuation mark used in a String

        String str = "Java12.;!";

        int punctuation = str.replaceAll("[\\s,A-Za-z0-9]", "").length();

        System.out.println(punctuation);


    }
}
