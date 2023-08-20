package practices.practices01;

public class Q05_Arrays {

    public static void main(String[] args) {


        // Arrays are not unchangeable, fixed in length


        // Create a String array, add 5 elements in it, find the sum of the number of the characters in all Strings


        String[] cities = { "Istanbul", "Baku", "London", "NewYork", "Tokyo"};

        int sum = 0;

        for (String w: cities){

            sum = sum + w.length();

        }
        System.out.println(sum);



    }

}
