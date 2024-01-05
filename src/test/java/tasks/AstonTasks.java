package tasks;

import java.util.Objects;
import java.util.Scanner;
public class AstonTasks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задания: (Число 1-4)");
        int numTask = in.nextInt();
        switch (numTask) {
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3();
                return;
            case 4:
                task4();
                break;

        }

    }
    public static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int inputNum = in.nextInt();
        if (inputNum > 7) {
            System.out.println("Привет");
        }
    }
    public static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String inputName = in.nextLine();
        if (Objects.equals(inputName, "Вячеслав")) {
            System.out.println("Привет, " + inputName);
        }
        else {
            System.out.println("Нет такого имени");
        }
    }
    public static void task3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите число:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Полученный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println ();
        System.out.print ("Числа массива, кратные 3:");
        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0){
                System.out.print (" " + array[i]);
            }
        }
    }
    public static void task4() {
        System.out.println("Нет, т.к после каждой открывающей скобки требуется закрывающая, " +
                            "как и перед каждой закрывающей скобки требуется открывающая. " +
                            "В данном примере '[((())()(())]]' имеются непарные '(' и ']' скобки ");
    }




    //Методы для JUnit
    public static void task1(int inputNum) {
        if (inputNum > 7) {
            System.out.println("Привет");
        }
    }
    public static void task2(String inputName) {
        if (Objects.equals(inputName, "Вячеслав")) {
            System.out.println("Привет, " + inputName);
        }
        else {
            System.out.println("Нет такого имени");
        }
    }
    public static void task3(int[] array) {
        System.out.print ("Полученный массив:");
        for (int j : array) {
            System.out.print(" " + j);
        }
        System.out.println ();
        System.out.print ("Числа массива, кратные 3:");
        for (int j : array) {
            if (j % 3 == 0) {
                System.out.print(" " + j);
            }
        }
        System.out.println ();
    }
}
