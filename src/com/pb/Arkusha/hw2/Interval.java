package com.pb.Arkusha.hw2;

import java.util.Scanner;

import static java.lang.System.*;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        int operand1;

        out.print("Введите желаемое число: ");
        operand1 = scan.nextInt();
        if (operand1 >= 0 && operand1 <= 14) {
            out.print("Это диапазон  0-14");
        }
else if (operand1 >= 15 && operand1 <= 35) {
            out.print("Это диапазон  15-35");
        }
        else if (operand1 >= 36 && operand1 <= 50) {
            out.print("Это диапазон  36-50");
        }
        else if (operand1 >= 51 && operand1 <= 100) {
            out.print("Это диапазон  51-100");
        }
        else {
            out.print("Это число не входит в заданные промежутки");
        }
    }
}
