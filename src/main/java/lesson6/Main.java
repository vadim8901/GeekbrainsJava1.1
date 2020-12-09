package lesson6;

import lesson6.animals.*;

public class Main {



    public static void main(String[] args) {
        Cat cat = new Cat("Bo");

        Dog dog = new Dog("Be");

        cat.run(150);

        dog.run(300);

        cat.swim(2);

        dog.swim(8);
    }

}
