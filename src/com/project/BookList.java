package com.project;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lihaocheng
 * @create 2019-04-15 12:35
 **/

public class BookList{
    private String ListName;
    private List<Book> bookList;


    public BookList(String listName, List<Book> bookList) {
        ListName = listName;
        this.bookList = bookList;
    }

    public String getListName() {
        return ListName;
    }

    public void setListName(String listName) {
        ListName = listName;
    }

    public List<Book> getBookList() {
        return bookList;
    }


    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void addToList(Book book){
        bookList.add(book);

    }


    public Book searchBookByName(String name){

        return new Book("111","11","11","11");

    }

//    public Book searchBookById(String id){
//
//    }



}
