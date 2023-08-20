package questionBank;

public class WrapperClasses {


   public static void main(String[] args) {

      // Type a code to find the sum of the minimum value of the byte

      // and the maximum value of short data types


      byte b = Byte.MIN_VALUE;

      short s = Short.MAX_VALUE;

      System.out.println(b + s);



      // Type a code to convert "103" String to byte and
      // to convert "2351" String to short then print the difference on the console


      String num = "103";

      String num2 = "2351";

      byte first = Byte.valueOf(num);

      short second = Short.valueOf(num2);

      System.out.println(second - first);




   }
}
