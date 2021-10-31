package ru.mirea.java.practice16;

import java.util.HashMap;

public class OrderManager {

    private Order[] orders = new RestaurantOrder[20];
    private HashMap<String, Order> hashmap = new HashMap<>();

    public void add(Order order,int tableNumber) {
        orders[tableNumber] = order;
    }
    public void add(String address,Order order) {
        hashmap.put(address,order);
    }

    public Order getOrders(int tableNumber) {
        return orders[tableNumber];
    }
    public Order getOrders(String address) {
        return hashmap.get(address);
    }

    public void addDish(Item item, int tableNumber) throws IllegalTableNumberException {
        if (tableNumber < 0 || tableNumber  >= orders.length) throw new IllegalTableNumberException();
        orders[tableNumber].add(item);
    }
    public void addDish(Item item, String adress){
        hashmap.get(adress).add(item);
    }

    public void removeOrder(int tableNumber) {
        orders[tableNumber] = null;
    }
    public void removeOrder(String adress) {
        hashmap.remove(adress);
    }

    public int freeTableNumber(){
        for (int i = 0; i < 20;i++){
            if (orders[i] == null)
                return i;
        }
        return -1;
    }
    public int[] freeTabelNumbers(){
        int[] a = new int[20];
        int j = 0;
        for (int i = 0; i < 20;i++)
            if (orders[i] == null) {
                a[j] = i;
                j++;
            }
        return a;
    }

    public Order[] getOrders() {
        return orders;
    }
    public Order[] getHashOrders() {
        return hashmap.values().toArray(new Order[0]);
    }

    public double ordersCostSummary() {
        int count = 0;
        for (int i = 0; i < 20; i++)
            if(orders[i] != null)
                count += orders[i].costTotal();
        return count;
    }
    public double hashCostSummary() {
        int count = 0;
        for(Order i: hashmap.values())
            count += i.costTotal();
        return count;
    }
    public int dishQuantity(String dishName){
        int count = 0 ;
        for (int i = 0; i < 20; i++)
            count += orders[i].itemQuantity(dishName);
        return count;
    }
    public int dishHashQuantity(String dishName){
        int count = 0 ;
        for (String i: hashmap.keySet())
            if (i.equals(dishName)) count += hashmap.get(dishName).itemQuantity(dishName);
        return count;
    }
}