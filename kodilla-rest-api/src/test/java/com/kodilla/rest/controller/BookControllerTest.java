package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


class BookControllerTest {

    @Test
    public void shouldFetchBooks() {
        //Given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("TITLE 1", "AUTHOR 1"));
        bookList.add(new BookDto("TITLE 2", "AUTHOR 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);
        //When
        List<BookDto> result = bookController.getBooks();
        //Then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBook() {
        // given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        BookDto bookDto = new BookDto("TITLE 3", "AUTHOR 3");

        // when
bookController.addBook(bookDto);

        // then
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(bookDto);
    }
}