package day20exceptions;

public class C03IllegalGradeException extends RuntimeException{

    // first part of class name is describe the exception situation, last part of the name is always the word 'exception'

    // this is runtimeexception class

    public C03IllegalGradeException(String message) {   // I created my own exception for my application,
        super(message);
    }
}
