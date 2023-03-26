package lesson1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.DateTimeException;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Scanner;
public class Task2 {
    public static void name(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите имя: ");
        String userName = scanner.next();
        LocalDateTime now = LocalDateTime.now();
        if (now.isAfter(ChronoLocalDateTime.from(LocalTime.of(5, 0))) &&
                now.isBefore(ChronoLocalDateTime.from(LocalTime.of(11, 59)))){
            System.out.println("Доброе утро, " + userName + "!");
        } else if (now.isAfter(ChronoLocalDateTime.from(LocalTime.of(12, 0))) &&
                now.isBefore(ChronoLocalDateTime.from(LocalTime.of(17, 59)))){
            System.out.println("Добрый день, " + userName + "!");
        } else if (now.isAfter(ChronoLocalDateTime.from(LocalTime.of(18, 0))) &&
                now.isBefore(ChronoLocalDateTime.from(LocalTime.of(22, 59)))){
            System.out.println("Добрый вечер, " + userName + "!");
        } else {
            System.out.println("Доброй ночи, " + userName + "!");
        }
    }
}

