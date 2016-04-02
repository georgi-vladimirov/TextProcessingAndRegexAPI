package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by GOGO on 2.4.2016 г..
 */
public class StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] text = input.nextLine().split("(\\W|\\d)+");
        Arrays.stream(text).filter(w-> Character.isUpperCase(w.charAt(0))).forEach(w-> System.out.print(w.trim()+ " "));
    }
}
