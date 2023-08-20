package day17opp;

public class CarRunner {

    public static void main(String[] args) {

    Honda myHonda = new Honda();

    myHonda.price();//  price() method is a concrete method in interface and it was created by "default" keyword
                    //
                    //  That kind of methods are called "default methods"
                    //  default methods are accessible by using object => myHonda is an object. I access to default method by using the object


    Engine.accelerate(); // accelerate() method is a concrete method in interface, it was created by "static" keyword

                        // "default methods" are accessible by interface name (Engine.)


        System.out.println(Engine.ENGINE_NAME); // Electrical Engine => I access engineName with Engine interface.


    }
}
