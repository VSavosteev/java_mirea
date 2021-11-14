package ru.mirea.java.practice19_20;

import java.util.*;

public class Test19_20 {
    static Map<Integer, String> numb = new HashMap<>();
    static int[] masDigits = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static String genNumber() {
        int a = (int) (Math.random() * 10 + 0);
        String str = numb.get((int)(Math.random() * 12 + 0)) + masDigits[a]+masDigits[a]+masDigits[a] +
                numb.get((int)(Math.random() * 12 + 0))+numb.get((int)(Math.random() * 12 + 0))+ (int)(Math.random() * 199 + 1) ;
        return str;
    }

    public static void main(String[] args) {
        numb.put(0, "А");
        numb.put(1, "В");
        numb.put(2, "Е");
        numb.put(3, "К");
        numb.put(4, "М");
        numb.put(5, "Н");
        numb.put(6, "О");
        numb.put(7, "Р");
        numb.put(8, "С");
        numb.put(9, "Т");
        numb.put(10, "У");
        numb.put(11, "Х");

        ArrayList<String> array = new ArrayList<>();
        TreeSet<String> tree = new TreeSet<>();
        HashSet<String> hash = new HashSet<>();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 0; i < N; i++){
            String  k = genNumber();
            array.add(k);
            tree.add(k);
            hash.add(k);
            System.out.println(k);
        }

        String str = in.next();
        long beginTime = System.nanoTime();
        boolean b = array.contains(str);
        long elapsedTime = System.nanoTime() - beginTime;
        if (b) System.out.println("Поиск перебором: номер найден, поиск занял " + elapsedTime + "нс");
        else System.out.println("Поиск перебором: номер не найден, поиск занял " + elapsedTime +"нс");

        Collections.sort(array);
        beginTime = System.nanoTime();
        int cls;
        cls = Collections.binarySearch(array, str);
        elapsedTime = System.nanoTime() - beginTime;
        if (cls >=0) System.out.println("Бинарный поиск: номер найден, поиск занял " + elapsedTime + "нс");
        else System.out.println("Бинарный поиск: номер не найден, поиск занял " + elapsedTime +"нс");

        beginTime = System.nanoTime();
        b = tree.contains(str);
        elapsedTime = System.nanoTime() - beginTime;
        if (b) System.out.println("Поиск в TreeSet: номер найден, поиск занял " + elapsedTime + "нс");
        else System.out.println("Поиск в TreeSet: номер не найден, поиск занял " + elapsedTime +"нс");

        beginTime = System.nanoTime();
        b = hash.contains(str);
        elapsedTime = System.nanoTime() - beginTime;
        if (b) System.out.println("Поиск в HashSet: номер найден, поиск занял " + elapsedTime + "нс");
        else System.out.println("Поиск в HashSet: номер не найден, поиск занял " + elapsedTime +"нс");

    }
}