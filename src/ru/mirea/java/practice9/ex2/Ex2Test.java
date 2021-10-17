package ru.mirea.java.practice9.ex2;

import java.util.ArrayList;

public class Ex2Test {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Соловьёв Владислав Сергеевич", 84, 1, 20));
        s.add(new Student("Волкова Ирина Анатольевна", 91, 1, 19));
        s.add(new Student("Круглов Пётр Васильевич", 73, 3, 18));
        s.add(new Student("Воронова Анна Сергеевна", 57, 2, 19));
        new LabClassUi(s);
    }

}