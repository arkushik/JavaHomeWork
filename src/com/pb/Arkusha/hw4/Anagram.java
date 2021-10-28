package com.pb.Arkusha.hw4;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Введите свой текст");
        String textt, textt2, t1, t2; //scan.nextLine();
        textt = "Аз есмь строка, живу я, мерой острt.";
        System.out.println(textt);
        //anagram1(textt);
        System.out.println(anagram(textt).toLowerCase());
        char[] ch1=(anagram(textt).toLowerCase()).toCharArray();
        for(int i=0;i<ch1.length;i++) {
            ;
        }
        Arrays.sort(ch1);
        System.out.println(ch1);

        textt2 = "За семь морей ростка я вижу рост.";
        System.out.println(textt2);
        System.out.println(anagram(textt2).toLowerCase());
        char[] ch2=(anagram(textt2).toLowerCase()).toCharArray();
        for(int i=0;i<ch2.length;i++) {
            ;
        }
        Arrays.sort(ch2);
        System.out.println(ch2);

        if(Arrays.equals(ch1, ch2)) {
            System.out.println("This is anagrams");
        } else {
            System.out.println("This is not anagrams");
        }


    }

    private static String anagram (String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character .isLetterOrDigit(s.charAt(i)))
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }



}
