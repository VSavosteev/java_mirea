package ru.mirea.java.practice16;

public class Drink implements Item {
    private final int price;
    private final String name;
    private final String description;
    private final int priceZero = 0;
    public Drink(int price, String name, String description) throws IllegalArgumentException{
        if(price < 0 || name.equals("") || description.equals(""))
            throw new IllegalArgumentException();
        this.price = price;
        this.name = name;
        this.description = description;
    }
    public Drink(String name, String description) throws IllegalArgumentException{
        if(name.equals("") || description.equals(""))
            throw new IllegalArgumentException();
        this.price = priceZero;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }
}