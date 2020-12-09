package lesson6.animals;

public class Cat extends Animals{

    public Cat(String name){
        super(name);
    }

    @Override
    public void run(int meter) {
        if (meter < 200) {
            super.run(meter);
        }
        else {
            System.out.println("Error!");
        }
    }

    @Override
    public void swim(int meter) {
        System.out.println("Коты не плавают");
    }
}
