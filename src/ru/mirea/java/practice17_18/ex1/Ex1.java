package ru.mirea.java.practice17_18.ex1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {
    static void CheckString(String s) {
        Pattern p = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m =p.matcher(s);
        boolean b = m.matches();
        if (b){
            System.out.println("Данная сторка является строкой abcdefghijklmnopqrstuv18340");
        } else {
            System.out.println("Данная сторка не является строкой abcdefghijklmnopqrstuv18340");
        }
    }

    public static void main(String[] args) {
        String s1 = "abcdefghijklmnopqrstuv18340";
        String s2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        CheckString(s1);
        CheckString(s2);

        Scanner sc = new Scanner(System.in);
        String s3 = sc.nextLine();

        CheckString(s3);
    }
}
