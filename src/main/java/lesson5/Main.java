package lesson5;

public class Main {

    public static void main(String[] args) {
        Employee Chel = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        System.out.print(Chel.toString());
        Employee[] Chel1 = {
                new Employee("Ivanov Ivan32", "Engin3432eer", "iviv1321n`1`@mailbox.com", "892312312", 30543200, 12),
                new Employee("Ivanov Ivan32", "Engi3423neer", "ivivan3243@mailbox.com", "892312312", 30000, 324),
                new Employee("Ivanov Ivan23", "Engin3242eer", "ivivan@mailbox.com", "8922342312", 30230, 32),
                new Employee("Ivanov Ivan234", "Engi3242neer", "iviv2312an@mailbox.com", "892323312", 300210, 32),
                new Employee("Ivanov Ivan432", "Engineer", "iviv3423an@mailbox.com", "89231211312", 30124310, 35)
        };

        for (int i = 0; i < Chel1.length; i++) {
            System.out.print(Chel1[i]);
        }
    }
}
