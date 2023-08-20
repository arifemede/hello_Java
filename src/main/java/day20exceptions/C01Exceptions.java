package day20exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*

   1) FileNotFoundException: Java throws FileNotFoundException, if the "path is wrong" at the file " does not exist"

   2) IOException: Java throws IOException for all issues related with "Input and Output"

   3) IOException is a parent of FileNotFoundException

   4) IOException and FileNotFoundException are "Compile Time Exception" because Exception occur when we type the code,

   5) We may need some codes to be executed under every condition(like cutting connection with the database),

      to do this type the code in "finally block"

  --- Interview Question: can you please explain the differences between finally block and final keyword?

   6) " try block" can not be used alone  - interview question: can you use try without catch?
        "try block" can be used like "try block + single catch" or "try block + multiple catch"
        "try block + single catch + finally" or "try block + multiple catch + finally" or "try block + finally"

 */


public class C01Exceptions {

    public static void main(String[] args) {

        findAndReadTheFile();


    }


    // Create a method to read text in a text file.

      public static void findAndReadTheFile ()  { // I don't ask for any new data. my method will read the text file. that's why I make it void. if I need new data I am not writing void but data type.

          try { // ==> to access the file, if there is any problem to reach the file

              FileInputStream fis = new FileInputStream("src/main/java/day20exceptions/MyFile.txt");  // this code is to access the file

              // I am creating an object from FileInputStream class. I name the object as fis. (If the class name is long use the initials of object)
              // To work with files Java created a class; FileInputStream. This class has many functionalities to use for files

              int k = 0; // I am creating an integer container. And use while loop;

              while((k=fis.read())!= -1){ // k is starting from ASCII value of J, (first letter of MyFile text) ==> from k to the end of the text file
                                          // this code will get every char from the text file

                  System.out.print((char)k);  // then it print it as char again,

                                             // the loop will continue to read the characters one by one
              }


          } catch (FileNotFoundException e) {   // ==> If there is problem to reach the file , I will handle it with catch
              System.out.println(" The path is wrong or the file was deleted...");
          } catch (IOException e) {  // if the read method can not read the text, catch and handle it. (IOException is Input Output Exception. It means it can handle every issue with input and output)
              System.out.println("The text in the file could not be read");
          } finally {
              System.out.println("Cut the connection with the database");
          }

      }


      }



