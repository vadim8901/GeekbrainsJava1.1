package lesson1;

public class task {
    public static void main(String[] args){
        int a = 1;
        double b = 1.1;
        float c = 2;
        String str = "str";
        char ch = 'c';
        boolean bool = false;
        System.out.println("Task1:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(str);
        System.out.println(ch);
        System.out.println(bool);
        System.out.println("Task2:");
        Fun();
        System.out.println("Task3:");
        Check(10, 4);
        Check(20, 10);
        System.out.println("Task4:");
        PosANeg(8);
        PosANeg(-2);
        System.out.println("Task5:");
        Neg(-1);
        Neg(10);
        System.out.println("Task6:");
        SendName("Вадим");
    }
    public static void Fun(){
        float a = 1;
        float b = 2;
        float c = 3;
        float d = 4;
        System.out.println( a * (b + (c / d)));
    }
    public static void Check(int num_one,int num_two ){
        int a = num_one;
        int b = num_two;
        int sum = a + b;
        boolean bool = false;
        if (sum <= 20 && sum > 10){
            bool = true;
        }
        System.out.println(bool);
    }
    public static void PosANeg(int number){
        int x = number;
        if(x < 0)
        {
            System.out.println("Число отрицательное!");
        }
        else{
            System.out.println("Число положительное!");
        }
    }
    public static void Neg(int number){
        int x = number;
        boolean bool = false;
        if(x < 0)
        {
            bool = true;
            System.out.println(bool);
        }
        else{
            System.out.println(bool);
        }
    }
    public static void SendName(String name){
        System.out.println("Привет, " + name + "!");
    }
}
