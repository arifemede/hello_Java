package day25Lambda;

import java.util.stream.IntStream;

public class C01Lambda {

    public static void main(String[] args) {

    }

    // Example 1: Create a method to calculate the sum of digits of every integer between given two integers

    //   45  46 47 ==? 4+5+4+6+4+7 = 30


    public static int findSumOfDigits(int s, int e) {

        return IntStream.rangeClosed(s, e).map(Utils::getSumOfDigits).sum();


    }


    // Example 2: Create a method to calculate the sum of the squares of the last digits of even elements

    public static int getSquareOfLastDigitOfEvens(int s, int e) {

     return IntStream.rangeClosed(s, e).filter(Utils::isEven).map(t -> t % 10).map(t -> t * t).sum();


    }


}


