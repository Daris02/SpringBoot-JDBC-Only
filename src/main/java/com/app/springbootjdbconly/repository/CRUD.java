package com.app.springbootjdbconly.repository;

import java.util.List;

public interface CRUD<T, ID> {
    T getById(ID id);

    List<T> findAll();

    T save(T toSave);

    List<T> saveAll(List<T> toSave);
}
