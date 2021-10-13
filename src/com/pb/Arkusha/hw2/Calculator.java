package com.pb.Arkusha.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1, operand2;

        System.out.print("Введите первое число: ");
       operand1 = scan.nextInt();

       System.out.print("Введите второе число: ");
       operand2 = scan.nextInt();

       System.out.print("Введите желаемый математический знак: ");
        String sign = scan.next();
        char sign1 = sign.charAt(0);
        System.out.println("Ваше выражение - " + operand1 + sign + operand2);

        switch (sign1) {
            case '*':
                System.out.println("Итог умножения = " /*+ operand1 + sign + operand2 = */+ (operand1 * operand2));
                break;
            case '/':
                if (operand2 == 0) System.out.print("Делить на ноль нельзя, братюнь");
                else {
                    System.out.println("Итог деления = " /*+ operand1 + sign + operand2 =*/ + ((float)operand1 / operand2));
                }
                break;
            case '-':
                System.out.println("Итог отнимания = " /*+ operand1 + sign + operand2 = */+ (operand1 - operand2));
            case '+':
                System.out.println("Сумма = " /*+ operand1 + sign + operand2 = */+ (operand1 + operand2));
                break;
            default:
                throw new IllegalStateException("Неизвестный знак: " + sign);
        }

        /*
        if (sign == "/") {
            if (operand2 == 0) System.out.print("Делить на ноль нельзя, братюнь");
            else System.out.println("operand1 / operand2 = " + (operand1 / operand2));
        } else if (sign == "*") {
            System.out.println("operand1 * operand2 = " + (operand1 * operand2));
        }else if (sign == "-") {
            System.out.println("operand1 - operand2 = " + (operand1 - operand2));
        }else if (sign == "+") {
            System.out.println("operand1 + operand2 = " + (operand1 + operand2));
        }
*/

    }
}