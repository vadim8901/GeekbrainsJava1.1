package lesson5;

public class Employee {
    private String fn;
    private String position;
    private String email;
    private String pn;
    private int salary;
    private int age;

    public Employee(String fn, String position, String email, String pn, int salary, int age) {
        this.fn = fn;
        this.position = position;
        this.email = email;
        this.pn = pn;
        this.salary = salary;
        this.age = age;
    }

    public void info(){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "fn='" + fn + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", pn='" + pn + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
