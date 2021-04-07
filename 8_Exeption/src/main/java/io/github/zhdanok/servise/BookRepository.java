package io.github.zhdanok.servise;

import io.github.zhdanok.bean.Book;
import io.github.zhdanok.bean.Repository;
import io.github.zhdanok.exeptions.ItemNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository implements Repository<Book> {

    Map<String, Book> bookMap = new HashMap<>();


    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        for (Map.Entry<String, Book> entry :
             bookMap.entrySet()) {
            books.add(entry.getValue());
        }
        return books;
    }

    @Override
    public Book findByld(String id) throws ItemNotFoundException {
        if (bookMap.containsKey(id)) {
            return bookMap.get(id);
        } else throw new ItemNotFoundException(id);

    }

    @Override
    public void save(Book item) {
        bookMap.put(item.getId(), item);

    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
        if (bookMap.containsKey(id)) {
            bookMap.remove(id);
        } else throw new ItemNotFoundException(id);
    }
}
