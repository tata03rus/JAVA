package lesson1;

import java.util.Scanner;

public class Homework2 {
    public static void factorial () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        Integer n = scanner.nextInt();
        int i = 2;
        int factorial = 1;
        if (n == 0) {
            factorial = 1;}
            else if (n == 1) {
                factorial = 1;
            } else {
                while (i <= n) {
                    factorial = factorial * i;
                    i++;
                }
            }
        System.out.println(factorial);
        }
    }
