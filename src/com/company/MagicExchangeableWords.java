package com.company;

import java.util.Scanner;

/**
 * Created by GOGO on 2.4.2016 г..
 */
public class MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] text = input.nextLine().split(" ");

        System.out.println(exchangeable(text));
    }

    public static boolean exchangeable(String[] text) {

        if (text[0].length() == text[1].length()) {
            for (int i = 0; i < text[0].length(); i++) {
                char c;
                char z;
                c = text[0].charAt(i);
                z = text[1].charAt(i);
                int index = 0;
                while (index != -1) {
                    index = text[0].indexOf(c, index + 1);
                    if (index != -1) {
                        if (text[1].charAt(index) != z) {
                            return false;
                        }
                    }
                }
                index =0;
                while (index != -1) {
                    index = text[1].indexOf(z, index + 1);
                    if (index != -1) {
                        if (text[0].charAt(index) != c) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
