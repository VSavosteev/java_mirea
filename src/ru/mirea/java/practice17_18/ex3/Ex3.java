package ru.mirea.java.practice17_18.ex3;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {
    static void FindUsdRurEu(String text) {
        String[] t;
        StringTokenizer st = new StringTokenizer(text, "\n");
        t = new String[st.countTokens()];
        int i = 0;
        while(st.hasMoreTokens()) t[i++] = st.nextToken();
        for (int j = 0;j<i;j++){
            if (Find(t[j]))
                System.out.println(t[j]);
        }
    }

    static boolean Find(String t) {
        Pattern p = Pattern.compile("[0-9]+[.]{0,1}[0-9]{0,2}\s((USD)|(RUR)|(EU))");
        Matcher m =p.matcher(t);
        boolean b = m.matches();
        if (b)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String text = "23.78 USD\n22 UDD\n0.002 USD";
        FindUsdRurEu(text);

        String text2 = "10 RUB\n11.11 RUR\n10 RUR\n11.11 RUB\n0.001 RUR\n137 EU\n144 BC";
        FindUsdRurEu(text2);
    }
}
