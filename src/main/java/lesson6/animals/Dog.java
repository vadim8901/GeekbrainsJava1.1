package lesson6.animals;

public class Dog extends Animals{

    public Dog(String name){
        super(name);
    }

    @Override
    public void run(int meter) {
        if(meter < 500){
            super.run(meter);
        }
        else {
            System.out.println("Error!");
        }
    }

    @Override
    public void swim(int meter) {
        if (meter < 10){
            super.swim(meter);
        }
        else{
            System.out.println("Error!");
        }
    }
}
