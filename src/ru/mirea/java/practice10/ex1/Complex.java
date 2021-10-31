package ru.mirea.java.practice10.ex1;

public class Complex {
    private int image;
    private int real;

    public Complex(int real,int image) {
        this.image = image;
        this.real = real;
    }

    public Complex() {
    }

    public int getImage() {
        return image;
    }

    public int getReal() {
        return real;
    }

    public void setImaginary(int imaginary) {
        this.image = imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    @Override
    public String toString() {
        return "Complex{" + " real=" + real +
                ", image= " + image +
                '}';
    }
}
