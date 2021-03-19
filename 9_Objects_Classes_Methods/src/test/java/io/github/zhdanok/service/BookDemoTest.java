package io.github.zhdanok.service;

import io.github.zhdanok.bean.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookDemoTest {

    BookDemo bookDemo;
    Book book;

    @BeforeEach
    void setUp() {
        bookDemo = new BookDemo();
        book = new Book();
        book.setAuthor("Pushkin");
        book.setNameOfBook("Lucomorie");
        book.setNumberOfPages(30);
    }

    @Test
    void getTest() {
        assertEquals("Pushkin", book.getAuthor());
        assertEquals("Lucomorie", book.getNameOfBook());
        assertEquals(30, book.getNumberOfPages());

    }

    @Test
    void setTest() {
        book.setAuthor("Gogol");
        assertEquals("Gogol", book.getAuthor());
        }

    @Test
    void equalsTestPositive() {
        Book book2 = new Book();
        book2.setAuthor("Pushkin");
        book2.setNameOfBook("Lucomorie");
        book2.setNumberOfPages(30);
        boolean result = bookDemo.equalsBook(book, book2);
        assertTrue(result);

    }

    @Test
    void equalsTestNegative() {
        Book book3 = new Book();
        book3.setAuthor("Pushkin");
        book3.setNameOfBook("Ruslan & Liudmila");
        book3.setNumberOfPages(30);
        boolean result = bookDemo.equalsBook(book, book3);
        assertFalse(result);

    }

    @Test
    void printToString() {
        bookDemo.printToString(book);
    }


}