package io.github.zhdanok.servise;

import io.github.zhdanok.bean.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Logger logger = LoggerFactory.getLogger(LibraryTest.class);

    Library library = new Library();

    @BeforeEach
    void addTheBook() {
        for (Book book : library.createBooks()) {
            library.addTheBook(book);
        }
    }


    @Test
    void testBeforeEach() {
        assertIterableEquals(Arrays.asList(library.createBooks()), library.catalog);
        logger.info("Books successfully added to library's catalog");
    }

    @Test
    void deleteTheBook() {
        Book unnecessaryBook = new Book("Dostoevskiy", "Prestupleniye & nakazaniye");
        library.deleteTheBook(unnecessaryBook);
        assertFalse(library.catalog.contains(unnecessaryBook));

    }

    @Test
    void findTheBookByTitle() {
        String searchTitle = "1984";
        Book searchBook = library.findTheBookByTitle(searchTitle);
        Book expectedBook = new Book("Oruell", "1984");
        assertEquals(expectedBook, searchBook);
        logger.info("Searched book is {}", searchBook);

    }

    @Test
    void findTheBookIfItIsEmpty() {
        String searchTitle = "Kolobok";
        Book searchBook = library.findTheBookByTitle(searchTitle);
        assertEquals(null, searchBook);
        logger.info("Searched book {} is absent", searchTitle);

    }

    @Test
    void findAllBookByAuthor() {
        String searchAuthor = "Pushkin";
        List<Book> searchBooks = library.findAllBookByAuthor(searchAuthor);
        List<Book> expectedBooks = Arrays.asList(
                new Book("Pushkin", "Eugeniy Onegin"),
                new Book("Pushkin", "Asya"),
                new Book("Pushkin", "Ruslan & Liudmila")
        );
        assertEquals(expectedBooks, searchBooks);
        logger.info("Searched books is {}", searchBooks);
    }
}