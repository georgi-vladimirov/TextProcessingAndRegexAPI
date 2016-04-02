package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        Pattern emailPattern = Pattern.compile("[a-z0-9._-]+@[a-z0-9.-]+\\.[a-z]+");
        Matcher mach = emailPattern.matcher(text);

        while (mach.find()){
            System.out.println(mach.group());
        }
    }
}
