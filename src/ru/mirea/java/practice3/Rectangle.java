package ru.mirea.java.practice3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        this.filled = false;
        this.color = "black";
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length){
        this.filled = false;
        this.color = "black";
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double width) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color;
    }
}