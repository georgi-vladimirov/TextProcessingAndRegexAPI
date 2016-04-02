package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by GOGO on 2.4.2016 г..
 */
public class CountAllWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] text = input.nextLine().split("\\W+");
        System.out.println(text.length);
    }
}
