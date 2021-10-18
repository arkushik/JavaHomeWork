/// определение четных/нечетных чисел

package com.pb.Arkusha.hw2;

import java.util.Scanner;

import static java.lang.System.out;

public class additional_hw_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;

        System.out.print("Введите число: ");
        operand1 = scan.nextInt();

        if (operand1 % 2 == 0) {
            out.print("Это четное число");
        } else {
            out.print("Это нечетное число");
        }
    }
}