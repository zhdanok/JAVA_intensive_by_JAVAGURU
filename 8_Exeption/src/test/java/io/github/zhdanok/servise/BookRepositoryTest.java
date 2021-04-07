package io.github.zhdanok.servise;

import io.github.zhdanok.bean.Book;
import io.github.zhdanok.exeptions.ItemNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryTest {

    Logger logger = LoggerFactory.getLogger(BookRepositoryTest.class);

    Book book;

    BookRepository bookRepository;

    @BeforeEach
    void setUp() {
        book = new Book("N123", "Viy", "Gogol", 125);
        bookRepository = new BookRepository();
        bookRepository.bookMap.put(book.getId(), book);
    }

    @Test
    void findAll() {
        Book book1 = new Book("S15", "Ono", "King", 517);
        bookRepository.save(book1);
        Book book2 = new Book("F198", "Boy", "Fered", 28);
        bookRepository.save(book2);
        List<Book> books = bookRepository.findAll();
        List<Book> expected = Arrays.asList(
                new Book("N123", "Viy", "Gogol", 125),
                new Book("S15", "Ono", "King", 517),
                new Book("F198", "Boy", "Fered", 28)
        );
        assertEquals(expected, books);

    }

    @Test
    void findByldPositive() throws ItemNotFoundException {
        Book actual = bookRepository.findByld(book.getId());
        Book expected = book;
        assertEquals(expected, actual);
    }

    @Test
    void findByldNegative() {
        Throwable e = assertThrows(ItemNotFoundException.class, () -> {
            Book actual = bookRepository.findByld("15");
        });
        assertEquals("15", e.getMessage());
    }

    @Test
    void save() {
        Book book1 = new Book("S15", "Ono", "King", 517);
        bookRepository.save(book1);
        assertTrue(bookRepository.bookMap.containsValue(book1));

    }

    @Test
    void deletePovitive() throws ItemNotFoundException {
        bookRepository.delete(book.getId());
        assertFalse(bookRepository.bookMap.containsValue(book));
    }

    @Test
    void deleteNegative()  {
        Throwable e = assertThrows(ItemNotFoundException.class, () -> {
            bookRepository.delete("15");
        });
        assertEquals("15", e.getMessage());

    }
}