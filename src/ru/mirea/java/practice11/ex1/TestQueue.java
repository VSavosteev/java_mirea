package ru.mirea.java.practice11.ex1;

public class TestQueue {
    public static void main(String[] args) {
        ArrayQueueModule aqm = ArrayQueueModule.getInstance();
        aqm.enqueue("Text1");
        aqm.enqueue("Text2");
        aqm.enqueue("Text3");
        System.out.println(aqm.dequeue());

        ArrayQueueAdt adt = new ArrayQueueAdt(aqm);
        System.out.println(adt.dequeue());

        ArrayQueue aq = new ArrayQueue();
        System.out.println(aq.dequeue());    }
}
