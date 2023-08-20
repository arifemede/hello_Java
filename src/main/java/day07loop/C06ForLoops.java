package day07loop;

public class C06ForLoops {

    public static void main(String[] args) {


        //Example 10: Find the sum of the digits of decimal part in a double number
        //            28.587 ==> 5+8+7=20


        double n = 28.587;

        //Change the double data type to String data type because I need split() method, and I can use it just with Strings
        String s = String.valueOf(n);

        //Use split() method to get the decimal part
        String ds = s.split("\\.")[1];  // normally in regex, '.' has a special mean. so to express it is character I must use \\ before '.'
        // java split the 28.587 from decimal part. and get index 1 (587)
        System.out.println(ds);

        //Convert data type of "ds" to Integer to be able to do addition;

        int ids = Integer.valueOf(ds);
        System.out.println(ids);

        int sumOfDigits = 0;

        for (int i = ids; i > 0; i = i / 10) {
            sumOfDigits = sumOfDigits + i % 10;
        }
        System.out.println(sumOfDigits);



    }
}
