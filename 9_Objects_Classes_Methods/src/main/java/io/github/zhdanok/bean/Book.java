package io.github.zhdanok.bean;

import java.util.Objects;

public class Book {

    private String author;
    private String nameOfBook;
    private int numberOfPages;

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages && Objects.equals(author, book.author) && Objects.equals(nameOfBook, book.nameOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, nameOfBook, numberOfPages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", nameOfBook='" + nameOfBook + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
