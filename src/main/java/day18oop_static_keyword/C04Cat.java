package day18oop_static_keyword;

public class C04Cat implements C01Animal, C02Mammal, C03Carnivorous {

// if the parent interfaces all have method with same name and same return type there is no problem.

    @Override
    public int eat() {

        return 1;

    }

    @Override
    public int eat(String foodName) {
        return 0;
    }
}
