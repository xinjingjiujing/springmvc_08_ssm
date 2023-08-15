package com.itheima.service;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    public boolean save(Book book);

    public boolean delete(Integer id);

    public boolean update(Book book);

    public Book getById(Integer id);

    public List<Book> getAll();
}
