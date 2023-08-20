package day17opp;

/*
  1) Interfaces are abstract methods, abstract methods are uncompleted methods.
     That is why Java does not let create an object from interfaces

  2) Every classes' have constructors, and they create an object because they are child of object classes.

     Abstract class has also constructor, but can not create an object.  because interfaces are not child of object class

     Interface is not a class, it is different structure

  3) All methods in an interface must be overriden by concrete child classes.
     That is why interfaces are called as  "to do list" as well.

 */


public interface Engine {

    void start();  // All methods in an interface are " public" and "abstract" as default that is why no need to type "public" and "abstract" in method creation

    void stop();

    // Static concrete method: this method can be seen by all the child classes, because it is static
    static void accelerate(){
        System.out.println("Increase the speed so fast...");
    }


    // default concrete method: this method can not be shared by the child classes
    default void price(){

        System.out.println("Every engine has a price");
    }


    // Variables in an interface
    // 1) Variables in an interface are "final", final variables must be initialized
    //                                           The value of final variables connot be updated after initializing

    //                                           "final variables" names are type in upper cases

    // 2)All variables in an interface are " public", and "final" as default that is why no need to type "public", and "final" and "static" in method declaration




    String ENGINE_NAME ="Electrical Engine";  // public static final String engineName = "Electrical Engine";
                                            // it is public, static and final but you do not need it. bcz java knows it


}
