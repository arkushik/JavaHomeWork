package com.pb.Arkusha.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Угадайте задуманное число от 0 до 100");
        System.out.println("Для выхода из программы введите минусовое число.");

        final int MAX_ATTEMPT = 101; // Допустимое количество попыток (к-во от 0 до 100)
        int attempt = 0;           // Счетчик попыток.
        int cifra = random.nextInt(101);      // рандомное число от 0 до 100.
        System.out.println(cifra);
        //String str = Integer.toString(cifra);
        Scanner in = new Scanner(System.in);

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            int value = scan.nextInt();
            //String str2 = Integer.toString(value);

            if (value < 0) {  ///что бы прервать игру
                break;
            }
            if (value > (cifra)) {
                System.out.println("Ваше число меньше, чем введенное число - " + value);
                continue;
            }
            if (value < (cifra)) {
                System.out.println("Ваше число больше, чем введенное число - " + value);
                continue;
            }
            System.out.println("Поздравляем, Вы угадали число с " + attempt + " попытки!");
            break;
        }

        System.out.println("Конец игры!");
    }
}
