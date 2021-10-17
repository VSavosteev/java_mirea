package ru.mirea.java.practice11.ex4;

public class VariableNotFoundException extends IllegalArgumentException{
    VariableNotFoundException(String msg){
        super(msg);
    }
}