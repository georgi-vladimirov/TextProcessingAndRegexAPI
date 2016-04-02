package com.company;

import java.util.Scanner;

/**
 * Created by GOGO on 2.4.2016 г..
 */
public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String subString = input.nextLine();
        int count = 0;
        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = text.toLowerCase().indexOf(subString.toLowerCase(), lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex ++;
            }
        }
        System.out.println(count);
    }

}
