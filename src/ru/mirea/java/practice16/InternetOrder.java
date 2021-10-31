package ru.mirea.java.practice16;

import java.util.LinkedList;

public class InternetOrder implements Order {

    LinkedList<Item> a = new LinkedList();

    public InternetOrder() {
    }
    public InternetOrder(Item[] k) {
        for (int i = 0; i < k.length;i++)
            a.add(k[i]);
    }
    public boolean add(Item item) {
        a.add(item);
        return true;
    }
    public boolean remove(String itemName){
        for (Item it: a) {
            if (it.getName().equals(itemName)) {
                a.remove(it);
                return true;
            }
        }
        return false;
    }
    public int itemQuantity(){
        return a.size();
    }

    public Item[] getItems(){
        Item[] items = new Item[a.size()];
        int i = 0;
        for (Item it: a) {
            items[i] = it;
            i++;
        }
        return items;
    }
    public double costTotal() {
        double count = 0;
        for (Item it: a) {
            count += it.getPrice();
        }
        return count;
    }
    public int itemQuantity(String itemName){
        int count = 0;
        for (Item it: a) {
            if (it.getName().equals(itemName))
                count++;
        }
        return count;
    }
    public String[] dishesNames(){
        String[] ret = new String[a.size()];
        int i = 0;
        for (Item it: a) {
            ret[i] = it.getName();
            i++;
        }
        return ret;
    }
    public Item[] sortedDishesByCostDesc(){
        Item[] k = getItems();
        for (int out = a.size() - 1; out >= 1; out--)
            for (int in = 0; in < out; in++)
                if(k[in].getPrice() < k[in + 1].getPrice()) {
                    Item t = k[in];
                    k[in] = k[in+1];
                    k[in+1] = t;
                }
        return k;
    }
}