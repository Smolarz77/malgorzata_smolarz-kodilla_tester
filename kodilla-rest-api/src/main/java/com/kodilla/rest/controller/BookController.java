package com.kodilla.rest.controller;


import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@RestController – adnotacja ta mówi o tym, że nasza klasa jest kontrolerem REST API. Oznacza to tyle, że będzie ona odpowiedzialna za obsługę
// napływających żądań http request oraz za generowanie odpowiedzi http response.

//@RequestMapping("/books") – adnotacja ta wskazuje, jaki będzie adres URL naszej usługi.
// Domyślnie aplikacja w Springu uruchamia się na porcie 8080. Ustawienie więc
// ścieżki "/books" spowoduje, że nasza usługa będzie dostępna pod adresem http://localhost:8080/books.

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService  bookService;

    public BookController(BookService bookService) {

        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDto> getBooks() {   //metoda o nazwie getBooks(), która zwraca listę obiektów typu BookDto
        return bookService.getBooks();
    }
//adnotacja @PostMapping w linii nr 24 mówi o tym, że metoda addBook będzie odpowiedzialna za obsługę
// żądań wysyłanych metodą POST protokołu http.
@PostMapping
public void addBook(@RequestBody BookDto bookDto){
    bookService.addBook(bookDto);
}
//metody pozwalające na usunięcie wybranej książki z kolekcji.

    @DeleteMapping
    public void removeBook(@RequestBody BookDto bookDto) {
        bookService.removeBook(bookDto);
    }
}