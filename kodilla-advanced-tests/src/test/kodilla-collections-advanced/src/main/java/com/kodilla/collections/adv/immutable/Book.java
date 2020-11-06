package com.kodilla.collections.adv.immutable;

public class Book {
    protected final String author;  //protected:oznacza to, że są one traktowane jak pola prywatne z tym jednak zastrzeżeniem,
    protected final String title;   // że dostęp do nich mogą mieć również klasy dziedziczące z klasy Book.
    //Co robi słowo kluczowe final? Umieszczone przed polem informuje Javę, że wartość wpisana w tym polu powinna być traktowana jako stała i może być zmieniana jedynie w momencie tworzenia obiektu
    // (jako przypisanie wartości w miejscu deklaracji pola lub jako wynik działania konstruktora).

    public Book(String author, String title){
        this.author=author;
        this.title=title;
    }

    public final String getAuthor() {  //Obydwa gettery zostały oznaczone słowem final i od tej chwili nie jest już możliwe ich nadpisywanie.
        return author;
    }

    public final String getTitle() {
        return title;
    }
}
