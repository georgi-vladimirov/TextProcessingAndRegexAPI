package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by GOGO on 2.4.2016 г..
 */
public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] text = input.nextLine().split("\\W+");
        String word = input.nextLine();
        long count = Arrays.stream(text).filter(s -> s.toLowerCase().equals(word)).count();
        System.out.println(count);
    }
}
