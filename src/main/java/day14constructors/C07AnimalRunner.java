package day14constructors;

public class C07AnimalRunner {


    public static void main(String[] args) {


        C04Dog myDog = new C04Dog();

        myDog.eat();
        myDog.drink();
        myDog.bark();

        System.out.println(myDog.age);  //2
        System.out.println(myDog.name); // null



        C05Cat myCat = new C05Cat();

        myCat.meow();
        myCat.eat();
        myCat.drink();

    }
}
