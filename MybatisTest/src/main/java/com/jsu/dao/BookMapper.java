package com.jsu.dao;


import com.jsu.bean.Book;


public interface BookMapper {

    public Book getBookById(String id);
    public void delete(String string);
    public void update(Book book);
    public void saveBook(Book book);

}
