package ru.mirea.java.practice1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Упражнение 1");
        Ball ball1 = new Ball("red", 7);
        System.out.println(ball1.ToString());
        System.out.println();
        System.out.println("Упражнение 2");
        Book book1 = new Book("Interesting book", "A.A.Petrov", 2014, 21);
        System.out.println(book1.ToString());
    }
}
