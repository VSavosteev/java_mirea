package ru.mirea.java.practice10.ex2;

public class VictorianChair implements Chair {
    private int age;

    public int getAge() {
        return age;
    }

    public VictorianChair(int age) {
        this.age = age;
    }

    public VictorianChair() {
    }

    public void setAge(int age) {
        this.age = age;
    }
}