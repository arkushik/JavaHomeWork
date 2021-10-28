package com.pb.Arkusha.hw4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class CapitalLetter {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
//Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
        System.out.println("Введите свой текст");
        String textt; //scan.nextLine();
        textt = "Истина — это то, что выдерживает проверку опытом. Эйнштейн А.";
        System.out.println(textt);

       // String[] splitedd = textt.split(" ");

        capitalize(textt);

    }


    public static String capitalize(String text){
        String c = (text != null)? text.trim() : "";
        String[] words = c.split(" ");
        String result = "";
        for(String w : words){
            result += (w.length() > 1? w.substring(0, 1).toUpperCase(Locale.US) + w.substring(1, w.length()).toLowerCase(Locale.US) : w) + " ";
        }
        System.out.println(Arrays.toString(new String[]{result}));
        return result.trim();
    }

}


/*    для задачи следующей --- посимвольное разбитие
char[] chars = textt.toCharArray();

       for(char c: chars) {
               System.out.println(c);
               } */