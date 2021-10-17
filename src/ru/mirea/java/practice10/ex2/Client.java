package ru.mirea.java.practice10.ex2;

public class Client {
    public Chair chair;
    public void sit() {
        System.out.println("Sitting");
    }

    public Client() {
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}