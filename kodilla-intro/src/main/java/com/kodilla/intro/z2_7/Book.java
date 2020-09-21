package com.kodilla.intro;

public class Book {
    private String author;
    private String title;


    private static Book of(String author, String title) {
        Book book = new Book();
        book.author = author;
        book.title = title;
        return book;
    }

    public String getTitleAndAuthor() {
        return title +"      "+ author;
    }

    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        Book book2 = Book.of("Abraham Joshua Heschel", "Szabat");
        Book book3=Book.of("Abraham Joshua Heschel","Człowiek nie jest sam. Filozofia religii");
        System.out.println(book);
        System.out.println(book3.getTitleAndAuthor());
    }
}
