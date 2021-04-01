package io.github.zhdanok.bean;

import io.github.zhdanok.exeptions.ItemNotFoundException;

import java.util.List;

public interface Repository<T> {

    List<T> findAll();

    T findByld(String id) throws ItemNotFoundException;

    void save(T item);

    void delete(String id) throws ItemNotFoundException;
}
