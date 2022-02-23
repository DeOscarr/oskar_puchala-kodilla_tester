package com.kodilla.collections.adv.immutable;

public class Book { //dodanie final przed klasa sprawia ze inne klasy nie moga po niej dziedziczyc
    protected final String author;
    protected final String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() { return  author; } //jesli gettery maja final, nie mozna ich nadpisac

    public String getTitle() { return title; }
}