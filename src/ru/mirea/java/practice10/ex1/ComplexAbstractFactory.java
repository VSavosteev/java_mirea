package ru.mirea.java.practice10.ex1;

public interface ComplexAbstractFactory {
    public Complex createComplex();
    public Complex createComplex(int real, int imaginary);
}