package ru.mirea.java.practice17_18.ex2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    static void CheckMac(String s) {
        //Pattern p = Pattern.compile("([a-f]+[A-F]+:){3}+([0-9]{2}+:){2}+[0-9]{2}");
        Pattern p = Pattern.compile("([0-9a-fA-F]{2}[:-]){5}[0-9a-fA-F]{2}");
        Matcher m =p.matcher(s);
        boolean b = m.matches();
        if (b){
            System.out.println("Данная строка является МАС-адресом");
        } else {
            System.out.println("Данная строка не является МАС-адресом");
        }
    }

    public static void main(String[] args) {
        String s1 = "aE:dC:cA:56:76:54";
        String s2 = "01:23:45:67:89:Az";

        CheckMac(s1);
        CheckMac(s2);

        Scanner sc = new Scanner(System.in);
        String s3 = sc.nextLine();

        CheckMac(s3);
    }
}
