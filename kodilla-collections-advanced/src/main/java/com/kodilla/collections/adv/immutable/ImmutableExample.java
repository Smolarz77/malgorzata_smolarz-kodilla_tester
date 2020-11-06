package com.kodilla.collections.adv.immutable;
import com.kodilla.collections.adv.immutable.BookHacked;
public class ImmutableExample {
    public static void main(String[] args) {
        Book book = new BookHacked("John Stewart", "The last chance");
        BookHacked bookHacked = (BookHacked) book;

        System.out.println(book.getTitle());
    }
}