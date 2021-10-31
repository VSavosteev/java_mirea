package ru.mirea.java.practice16;

public interface Order {
    public boolean add(Item item);
    public boolean remove(String itemName);
    public int itemQuantity();
    public double costTotal();
    public Item[] getItems();
    public int itemQuantity(String itemName);
    public String[] dishesNames();
    public Item[] sortedDishesByCostDesc();
}