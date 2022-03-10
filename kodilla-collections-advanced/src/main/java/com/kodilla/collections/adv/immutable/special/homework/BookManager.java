package com.kodilla.collections.adv.immutable.special.homework;

import java.util.*;

public class BookManager {
    public static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author){
        Book createdBook = new Book(title,author);

        if (books.contains(createdBook)) {
            System.out.println("Book already exists.");
            System.out.println(createdBook.getAuthor()+" "+createdBook.getTitle()+":"+ createdBook.hashCode());
        }else
        books.add(createdBook);
        return createdBook;
    }
}