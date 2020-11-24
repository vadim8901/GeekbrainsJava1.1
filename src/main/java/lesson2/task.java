package lesson2;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Scanner;

public class task {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {2, 2, 2, 1, 2, 2, 1, 2};
        System.out.println("Task1:");
        task1();
        System.out.println("Task2:");
        task2();
        System.out.println("Task3:");
        task3();
        System.out.println("Task4:");
        task4();
        System.out.println("Task5:");
        task5();
        System.out.println("Task6:");
        System.out.println(task6(array));
    }

    public static void array_output(int[]array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    public static void task1() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else if (array[i] == 0) {
                array[i] = 1;
            } else {
                throw new IllegalArgumentException("argument is not equal to neither 1 or 0");
            }
        }
        array_output(array);
    }

    public static void task2(){
        int size = 8;
        int[] array = new int[size];
        for(int i = 0; i < size; i++)
        {
            System.out.println("Введите число: ");
            array[i] = in.nextInt();
        }
        array_output(array);
    }

    public static void task3(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] < 6) array[i] *= 2;
        }
        array_output(array);
    }

    public static void task4(){
        int size_line = 5;
        int size_col = 5;
        int[][] array = new int[size_line][size_col];
        int line = 0;
        int col = 0;
        for(int i = 0; i < size_line; i++){
            for (int j = 0; j < size_col; j++){
                if(i == line && j == col)
                {
                    array[i][j] = 1;
                    line++;
                    col++;
                }
                else{
                    array[i][j] = 0;
                }
            }
        }
        for(int i = 0; i < size_line; i++) {
            for (int j = 0; j < size_col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void task5(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 0};
        int min;
        int max = 0;
        min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max) max = array[i];
            if(min >= array[i]) min = array[i];
        }
        System.out.printf("Минимальное число: %d, Максимальное число: %d\n", min,max);
    }

    public static boolean task6(int[]array){
        boolean flag = false;
        for(int i = 0; i < array.length; i++){
            int sum_before = 0;
            int sum_after = 0;
            for(int k = 0; k < i; k++){
                sum_before += array[k];
            }
            for(int j = array.length - 1; j >= i; j--){
                sum_after += array[j];
            }
            if(sum_after == sum_before){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
