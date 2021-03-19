package io.github.zhdanok.service;

import io.github.zhdanok.bean.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BookDemo {

    Logger logger = LoggerFactory.getLogger(BookDemo.class);

    public boolean equalsBook(Book book, Book book2) {
        if (book.equals(book2)) {
            return true;
        } else {
            return false;
        }
    }

    public void printToString(Book book) {
        logger.info("{}", book.toString());
    }
}
