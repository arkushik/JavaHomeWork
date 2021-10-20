package com.pb.Arkusha.hw3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array<array> {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];

        System.out.print("Введите 1е число для массива - ");
        array[0] = scan.nextInt();
        System.out.print("Введите 2е число для массива - ");
        array[1] = scan.nextInt();
        System.out.print("Введите 3е число для массива - ");
        array[2] = scan.nextInt();
        System.out.print("Введите 4е число для массива - ");
        array[3] = scan.nextInt();

        System.out.println("Числа 5-10 будут введены рандомно :)");
        array[4] = random.nextInt();
        array[5] = random.nextInt();
        array[6] = random.nextInt();
        array[7] = random.nextInt();
        array[8] = random.nextInt();
        array[9] = random.nextInt();
        System.out.println("Ваш массив: " + Arrays.toString(array));    ///Вывести на экран введенный массив.
        System.out.println("Сумма чисел вашего массива = " + (array[0] + array[1] + array[2] + array[3] + array[4] + array[5]
                + array[6] + array[7] + array[8] + array[9]));          ///Подсчитать сумму всех элементов массива и вывести ее на экран.

        ///Подсчитать и вывести на экран количество положительных элементов.
        int cntt = 0;
        for (int i = 0; i < array.length; i++)
            {
                if (array[i] > 0)
                {
                cntt++;
                }
            }
        System.out.println("Количество положительных чисел - " + cntt);
        ///end///


        ///Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком.
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println("Ваш отсортированный цикл: " + Arrays.toString(array));
        }
    }

