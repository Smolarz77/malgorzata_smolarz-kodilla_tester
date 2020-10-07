package com.kodilla.collections.adv.special.homework;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


    public class BookManager  {
        private Set<Book> bookSet;
        public BookManager(){
            this.bookSet= new HashSet<>();
        }
    public Book createBook(String title, String author) {  //metoda public Book createBook(String title, String author)
        Book book = new Book(title, author);  //nowy obiekt klasy Book z paramerami title, author
                                               // będzie tworzyła nowy obiekt klasy Book o zadanych parametrach.
        if (!bookSet.contains(book)) {
            bookSet.add(book);
            return book;
        }
        for (Book b : bookSet) {    //petla for-each
             if (b.equals((book))) {

                return b;
            }
        }
        return null;
    }}