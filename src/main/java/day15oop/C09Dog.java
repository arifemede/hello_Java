package day15oop;

public class C09Dog extends C08Mammal{




        @Override// @Override Annotation checks "Override" rules in our code
        public void eat() {
            System.out.println("Dogs eat...");
        }  //In "Method Overriding", if the "return type" is "void" do not change it

        @Override
        public int getWeight() {

            return 6;  // In "Method Overriding", if the "return type" is "primitive" do not change it
        }

        @Override
        public C07Animal create() {

            return new C09Dog();
        }

    }

