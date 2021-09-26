package ru.mirea.java.practice3;

public class MovableCircle implements Movable{
    protected int radius;
    protected MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    public String toString() {
        return "MovableCircle{" +
                "radius=" + this.radius +
                ", center{" + "x=" + this.center.x +
                ", y=" + this.center.y +
                ", xSpeed=" + this.center.xSpeed +
                ", ySpeed=" + this.center.ySpeed +
                "}}";
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}