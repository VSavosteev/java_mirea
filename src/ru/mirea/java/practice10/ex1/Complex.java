package ru.mirea.java.practice10.ex1;

public class Complex {
    private int imaginary;
    private int real;

    public Complex(int real,int imaginary) {
        this.imaginary = imaginary;
        this.real = real;
    }

    public Complex() {
    }

    public int getImaginary() {
        return imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    @Override
    public String toString() {
        return "Complex{" + " real=" + real +
                ", imaginary= " + imaginary +
                '}';
    }
}
