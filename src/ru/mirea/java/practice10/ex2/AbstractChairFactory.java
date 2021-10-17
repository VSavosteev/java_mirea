package ru.mirea.java.practice10.ex2;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicChair createMagicanChair();
    public FunctionalChair createFunctionalChair();
}