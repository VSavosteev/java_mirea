package ru.mirea.java.practice5;

import java.util.Scanner;

public class Recursion {
    //ex1
    static int ex1(int n) {
        return ex1(n, 1);
    }

    static int ex1(int n, int k) {
        for (int i = 1; i <= k; i++) {
            if (n < 1)
                return 0;
            System.out.print(k + " ");
            n--;
        }
        k++;
        return ex1(n, k);
    }

    //ex2
    static int ex2(int n) {
        return ex2(n, 1);
    }

    static int ex2(int n, int k) {
        System.out.print(k + " ");
        if (k == n) {
            return 0;
        }
        k++;
        return ex2(n, k);
    }

    //ex3
    static int ex3(int a, int b) {
        return ex3(a, b, a);
    }

    static int ex3(int a, int b, int i) {
        if (a < b) {
            if (i > b)
                return 0;
            System.out.print(i + " ");
            i++;
            return ex3(a, b, i);
        } else {
            if (i < b)
                return 0;
            System.out.print(i + " ");
            i--;
            return ex3(a, b, i);
        }
    }

    //ex4
    static int ex4(int k, int s) {
        return ex4(0, 0, k, s);
    }

    static int ex4(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c;
        if (len == 0) {
            c = 1;
        } else {
            c = 0;
        }
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += ex4(len + 1, sum + i, k, s);
        }
        return res;
    }

    //ex5
    static int ex5(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + ex5(n / 10);
        }
    }

    //ex6
    private static void ex6(int numb) {
        ex6(numb, 2);
    }

    private static void ex6(int numb, int div) {
        if (numb == 2) {
            System.out.println("YES");
            return;
        }
        if (numb % div == 0) {
            System.out.println("NO");
            return;
        }
        if (div > Math.sqrt(numb)) {
            System.out.println("YES");
            return;
        }
        ex6(numb, div + 1);
        return;
    }

    //ex7
    static int ex7(int n) {
        return ex7(n, 2);
    }

    static int ex7(int n,int k) {
        if (k > n / 2) {
            System.out.println(n);
            return 0;
        }
        if (n % k == 0) {
            System.out.println(k);
            return ex7(n / k, k);
        } else {
            return ex7(n, ++k);

        }
    }

    //ex8
    private static void ex8(String s){
        if(s.length() == 1){
            System.out.println("YES");
            return;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)){
            System.out.println("NO");
            return;
        }
        if(s.length()==2){
            System.out.println("YES");
            return;
        }
        ex8(s.substring(1, s.length()-1));
    }

    // ex9
    private static int ex9(int a, int b) {
        if (a > b + 1 ) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return ex9(a, b - 1) + ex9(a - 1, b - 1);
    }

    //ex10
    private static int ex10(int num){
        return ex10(num, 0);
    }

    private static int ex10(int num, int rev) {
        if (num == 0) return rev;
        return ex10(num / 10, 10 * rev + num % 10);
    }

    //ex11
    static int ex11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==0){
            n = in.nextInt();
            if (n==0){
                return 0;
            }
        }
        if (n==1) {
            return ex11()+1;
        }
        return ex11();
    }

    //ex12
    static void ex12() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                ex12();
            } else {
                ex12();
            }
        }
    }

    //ex13
    static void ex13() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m > 0) {
                ex13();
            }
        }
    }

    //ex14
    static String ex14(int n) {
        if (n < 10) {
            return Integer.toString(n);
        } else {
            return ex14(n / 10) + " " + n % 10;
        }
    }

    //ex15
    static int ex15(int n) {
        if (n < 10) {
            return n;
        } else {
            System.out.println(n % 10 + " ");
            return ex15(n / 10);
        }
    }

    //ex16
    static void ex16() {
        ex16(0, 0);
    }
    static void ex16(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max) {
                ex16(n, 1);
            } else if (n == max) {
                ex16(max, ++count);
            } else {
                ex16(max, count);
            }
        } else {
            System.out.println(count);
        }
    }

    //ex17
    public static int ex17() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            return 0;
        } else {
            return Math.max(n, ex17());
        }
    }

    //test
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        String s;
        System.out.print("Введите номер задания(1-17): ");
        a = in.nextInt();
        switch (a) {
            case 1:
                a = in.nextInt();
                ex1(a);
                in.close();
                break;
            case 2:
                a = in.nextInt();
                ex2(a);
                in.close();
                break;
            case 3:
                a = in.nextInt();
                b = in.nextInt();
                ex3(a, b);
                in.close();
                break;
            case 4:
                a = in.nextInt();
                b = in.nextInt();
                System.out.println(ex4(a, b));
                in.close();
                break;
            case 5:
                a = in.nextInt();
                System.out.println(ex5(a));
                in.close();
                break;
            case 6:
                a = in.nextInt();
                ex6(a);
                in.close();
                break;
            case 7:
                a = in.nextInt();
                ex7(a);
                in.close();
                break;
            case 8:
                s = in.nextLine();
                ex8(s);
                in.close();
                break;
            case 9:
                a = in.nextInt();
                b = in.nextInt();
                System.out.println(ex9(a, b));
                in.close();
                break;
            case 10:
                a = in.nextInt();
                System.out.println(ex10(a));
                in.close();
                break;
            case 11:
                System.out.println(ex11());
                break;
            case 12:
                ex12();
                break;
            case 13:
                ex13();
                break;
            case 14:
                a = in.nextInt();
                System.out.println(ex14(a));
                in.close();
                break;
            case 15:
                a = in.nextInt();
                System.out.println(ex15(a));
                in.close();
                break;
            case 16:
                ex16();
                break;
            case 17:
                System.out.println(ex17());
        }
    }
}

