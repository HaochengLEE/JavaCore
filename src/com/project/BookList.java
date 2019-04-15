package com.project;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lihaocheng
 * @create 2019-04-15 12:35
 **/

public class BookList extends ArrayList {
    private String ListName;
    private List<Book> BookList;




    ArrayList<Book> playList=new BookList();

    public boolean search(){
        if()
    }

    @Override
    public boolean add(Book b) {

        playList.add(b);

    }

    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }
}
