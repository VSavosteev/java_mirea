package ru.mirea.java.practice10.ex2;

public class Test2 {
    public static void main(String[] args) {
        Client c = new Client();
        ChairFactory factory = new ChairFactory();
        c.setChair(factory.createMagicanChair());
        ((MagicChair) c.chair).doMagic();
        c.setChair(factory.createFunctionalChair());
        int sum = ((FunctionalChair) c.chair).sum(15, 3);
        System.out.println("Sum:  " + sum);
        c.setChair(factory.createVictorianChair());
        ((VictorianChair) c.chair).setAge(67);
        int age = ((VictorianChair) c.chair).getAge();
        System.out.println("Age: " + age);
    }
}