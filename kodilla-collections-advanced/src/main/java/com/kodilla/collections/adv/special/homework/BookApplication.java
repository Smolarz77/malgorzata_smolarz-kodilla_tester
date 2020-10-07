package com.kodilla.collections.adv.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookApplication {
    public static void main(String[] args) {

        List<Book> books= new ArrayList<>();   //
        books.add(new Book ("Man Is Not Alone", "A. J. Heschel"));
        books.add(new Book("Szczerze","Donald Tusk"));
        books.add(new Book("Kobieta niezalezna","Kamila Rowinska"));
        books.add(new Book("Księgi Jakubowe","Tokarczuk Olga "));

//W metodzie main utwórz 2-3 obiekty klasy Book, używając do tego celu BookManager.
BookManager bookManager = new BookManager();
Book book1 = bookManager.createBook("Bieguni","Tokarczuk Olga");
Book book2 = bookManager.createBook("Jidisze Mame","Gołda Tencer");
Book book3 = bookManager.createBook("Szczerze","Donald Tusk");
Book book4 = bookManager.createBook("Bieguni","Tokarczuk Olga");

//metoda add, dodawanie obiektow
books.add(book1);
books.add(book2);
books.add(book3);
//Sprawdź, czy adresy utworzonych obiektów są takie same. Metoda: if else

        if(book1 == book2){
    System.out.println("book1 ma ten sam adres co book2");
            }else{
            System.out.println("book1 ma inny adres niz book2");

            if(book1 == book3){
                System.out.println("book1 ma ten sam adres co book3");
            }else {
                System.out.println("book1 ma inny adres niz book3");

                if (book1 == book4){
                    System.out.println("book1 ma ten sam adres co book4"); }
            else {
                    System.out.println("book1 ma inny adres niz book4");

                }
                System.out.println("________________________________");
                System.out.println("Suma = " + books.size());
                for(Book b : books)
                    System.out.println(b.getAuthor() + " - " + b.getTitle());}}
        }
    private static void showBooks(List<Book> books) {
        System.out.println(books.size());
        for (Book book : books) {
            System.out.println(book);
        }
    }
    }