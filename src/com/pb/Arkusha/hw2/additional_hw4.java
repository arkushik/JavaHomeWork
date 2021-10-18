///определение минимального модуля чисел

package com.pb.Arkusha.hw2;

import java.util.Scanner;

import static java.lang.Math.abs;

public class additional_hw4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1, operand2, operand3;

        System.out.print("Введите первое число: ");
        operand1 = scan.nextInt();

        System.out.print("Введите второе число: ");
        operand2 = scan.nextInt();

        System.out.print("Введите 3е число: ");
        operand3 = scan.nextInt();
        // char sign1 = sign.charAt(0);
        System.out.println("Ваши числа : " + operand1 + "," + operand2+ "," + operand3);

        int operand11 = abs(operand1);
        int operand22 = abs(operand2);
        int operand33 = abs(operand3);

        System.out.println("Ваши числа после модуля: " + operand11 + "," + operand22+ "," + operand33);

        if (operand11<=operand22 && operand11<=operand33)
        {
            System.out.println(operand11);
        }
        else if
        (operand22<=operand33 && operand22<=operand11)
        {
            System.out.println(operand22);
        }
        else if (operand33<=operand11 && operand33<=operand22)
        {
            System.out.println(operand33);
        }
        else {
            System.out.println("Неправильное выражение");
        }

    }
}
