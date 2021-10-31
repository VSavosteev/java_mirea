package ru.mirea.java.practice10.ex1;

import java.util.Scanner;
public class ConcreteFactory implements ComplexAbstractFactory{

    @Override
    public Complex createComplex() {
        Scanner in = new Scanner(System.in);
        int real = in.nextInt();
        int image = in.nextInt();
        Complex com = new Complex(real,image);
        return com;
    }

    @Override
    public Complex createComplex(int real, int image) {
        Complex com = new Complex(real,image);
        return com;
    }
}
