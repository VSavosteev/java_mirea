package ru.mirea.java.practice1;

public class Ball {
    private String color;
    private int radius;

    public Ball(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public Ball(String color) {
        this.color = color;
        this.radius = 5;
    }

    public Ball() {
        this.color = "white";
        this.radius = 5;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public String ToString() {
        return this.color+", radius "+this.radius;
    }
}
