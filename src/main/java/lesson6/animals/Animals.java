package lesson6.animals;

public class Animals {

    protected String name;

    public Animals(String name) {
        this.name = name;
    }

    public void run(int meter){
        System.out.println(name + " пробежал " + meter);
    }

    public void swim(int meter){
        System.out.println(name + " проплыл " + meter);
    }
}
