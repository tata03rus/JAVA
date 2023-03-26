package lesson1;

import java.util.Scanner;

public class Homework4 {
    public static void calculator () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        Float n1 = scanner.nextFloat();
        System.out.println("Введите второе число: ");
        Float n2 = scanner.nextFloat();
        System.out.println("Введите действие (+ или - или * или /): ");
        char enter = scanner.next().charAt(0);
        if (enter == '+') {
            float calc = n1 + n2;
            System.out.println(calc);
        } else if (enter == '-') {
            float calc = n1 - n2;
            System.out.println(calc);
        } else if (enter == '*') {
            float calc = n1 * n2;
            System.out.println(calc);
        } else if (enter == '/') {
            float calc = n1 / n2;
            System.out.println(calc);
        }
    }
}
