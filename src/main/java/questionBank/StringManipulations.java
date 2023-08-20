package questionBank;

public class StringManipulations {


    public static void main(String[] args) {


        // Create a String variable for city names which have just a single word.

        // Print the city name with the initial is in uppercase and all the other characters


       String city = "dareSsalam";

       String updatedCityName = city.trim().toLowerCase();

       updatedCityName = updatedCityName.substring(0,1).toUpperCase() + updatedCityName.substring(1);

        System.out.println(updatedCityName);


        // Create 3 String variables for people's names. Print the sum of the number of characters in all the 3 names except space characters.

        // Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console


        String name1 = "Atilla";

        String name2 = "Busra";

        String name3 = "Elif";

       Integer ch1 = name1.replaceAll("\\s","").length();

       Integer ch2 = name2.replaceAll("\\s","").length();

       Integer ch3 = name3.replaceAll("\\s","").length();

        System.out.println(ch1 + ch2 + ch3);




        // Create a String variable, print the total number if alphabetical and numeric characters in the String on the console.

        // Example: If the String is ' Miami 33018!!! ' you need to print 10 on the console


        String name = " Miami 33018!!! ";

        Integer numOfChars = name.trim().replaceAll("[^A-Za-z0-9]","").length();

        System.out.println(numOfChars);



        // Create a String variable, print the number of non-digit character in the String on the console

        // Example: If the String is '1a3Bcf4!...'  => you need to print 8 on the console

        String str = "Arife123Mede";

        Integer nonDigit = str.replaceAll("[0-9]","").length();

        System.out.println(nonDigit);


        // Create a String variable and print just the last non-space character on the console for any String

        // Example: For 'Ali Can' you should print n

        //          For 'Miami    ' you should print i etc.


        String str1 = "Elif Busra";

        String nonSpace = str1.replaceAll("\\s", "");

        Character lastChar = nonSpace.charAt(nonSpace.length()-1);

        System.out.println(lastChar);




        // Create a String variable and find the sum of the ASCII values of the first and the last characters of the String


        String s = "Arife";

        int indexOfLastChar = s.length()-1;

        int AsciiOfFirst = s.charAt(0);

        int AsciiOfLast = s.charAt(indexOfLastChar);

        System.out.println(AsciiOfFirst+AsciiOfLast);



        // Create a String variable and print all characters except the first character on the console.

        // Example: If the String is 'Java' you should print 'ava' on the console


        String st = "Java";

        String exceptFirst = st.trim().substring(1);

        System.out.println(exceptFirst);











    }
}
