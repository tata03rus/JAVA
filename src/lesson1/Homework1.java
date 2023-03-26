package lesson1;

import java.util.Scanner;

public class Homework1 {
    public static void sum() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите число: ");
        Integer n = scanner.nextInt();
        int i = 1;
        int sum = 0;
            while (i < n+1){
                sum = sum + i;
                i++;
        }
        System.out.println(sum);
    }
}
