package com.kodilla.collections.adv.special.homework;

    //Klasę BookManager, która będzie posiadała metodę public Book createBook(String title,
    // String author) i będzie tworzyła nowy obiekt klasy Book o zadanych parametrach.

import java.util.Objects;

public class BookManager extends Book{

        private String title;
    private String author;

        public BookManager(String author, String title) {
            super(title, author);
        }
        public Book book (String author, String title){
            this.author=author;
            this.title=title;
            return  book(author, title);
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookManager that = (BookManager) o;
        return Objects.equals(author, that.author) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }
}
