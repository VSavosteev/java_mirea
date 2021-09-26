package ru.mirea.java.practice1;

public class Book {
    private String name;
    private String author;
    private int year;
    private int pages;

    public Book(String name, String author, int year, int pages) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.pages = 1;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.year = 2021;
        this.pages = 1;
    }

    public Book(String name) {
        this.name = name;
        this.author = "unknown";
        this.year = 2021;
        this.pages = 1;
    }

    public Book() {
        this.name = "unnamed";
        this.author = "unknown";
        this.year = 2021;
        this.pages = 1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public String ToString() {
        return this.name+", "+this.author+", "+this.year+" year, "+this.pages+" pages";
    }
}
