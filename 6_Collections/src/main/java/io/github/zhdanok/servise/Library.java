package io.github.zhdanok.servise;

import io.github.zhdanok.bean.Book;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Library {

    List<Book> catalog = new LinkedList<>();

    public Book[] createBooks() {
        Book[] books = new Book[13];
        books[0] = new Book("Bulgakov", "Master & Margarita");
        books[1] = new Book("Pushkin", "Eugeniy Onegin");
        books[2] = new Book("Dostoevskiy", "Prestupleniye & nakazaniye");
        books[3] = new Book("Tolstoy", "Voina & mir");
        books[4] = new Book("Lermontov", "Geroy nashego vremeni");
        books[5] = new Book("Petrov", "12 stuliev");
        books[6] = new Book("Oruell", "1984");
        books[7] = new Book("Markes", "100 let odinochestva");
        books[8] = new Book("Rouling", "Garry Potter");
        books[9] = new Book("Gogol", "Mertviye dushi");
        books[10] = new Book("Pushkin", "Asya");
        books[11] = new Book("Gogol", "Viy");
        books[12] = new Book("Pushkin", "Ruslan & Liudmila");
        return books;
    }

    public void addTheBook(Book book) {
        catalog.add(book);
    }

    public void deleteTheBook(Book unnecessaryBook) {
        catalog.remove(unnecessaryBook);
    }

    public Book findTheBookByTitle(String searchTitle) {
        for (Book book:catalog) {
            if (book.getTitle().equals(searchTitle)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> findAllBookByAuthor(String searchAuthor) {
        List<Book> searchBooks = new ArrayList<>();
        for (Book book:catalog) {
            if (book.getAuthor().equals(searchAuthor)) {
                searchBooks.add(book);
            }
        }
        return searchBooks;
    }
}
