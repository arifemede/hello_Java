package day15oop;

public abstract class C08Mammal extends C07Animal {


    // @Override Annotation checks "Override" rules in our code
    public abstract void eat();

    public abstract int getWeight();

    public abstract C07Animal create();
}
