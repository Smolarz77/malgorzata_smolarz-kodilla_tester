package com.kodilla.rest.domain;

import java.util.Objects;
//Dto  Data Transfer Object - objekt transferowy
public class BookDto {
    private String title;
    private String author;

    public BookDto() {
    }

    public BookDto(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    //Uzupełnij klasę BookDto o metody equals oraz hashCode, dzięki czemu będziesz mieć możliwość usuwania obiektów z
    // listy książek przy pomocy metody remove(Object o) kolekcji books wewnątrz klasy BookService.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDto bookDto = (BookDto) o;
        return Objects.equals(title, bookDto.title) &&
                Objects.equals(author, bookDto.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}