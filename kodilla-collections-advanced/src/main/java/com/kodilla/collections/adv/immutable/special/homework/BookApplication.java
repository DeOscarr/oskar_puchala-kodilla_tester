package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {

    public static void main(String[] args) {
        //Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        //Book book2 = new Book("J.K. Rowling", "Harry Potter and the Philosopher’s Stone");
        //Book book3 = new Book("J.K. Rowling", "Harry Potter and the Philosopher’s Stone");
        Book book1= BookManager.createBook("Marcel Proust", "In Search of Lost Time");
        Book book2= BookManager.createBook("J.K. Rowling", "Harry Potter and the Philosopher’s Stone");
        Book book3= BookManager.createBook("J.K. Rowling", "Harry Potter and the Philosopher’s Stone");



        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));
        System.out.println("-----");
        System.out.println(book2 == book3);
        System.out.println(book2.equals(book3));//na podstawie wartosci

    }
}
