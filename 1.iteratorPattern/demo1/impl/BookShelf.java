package org.example.impl;

import org.example.entity.Book;
import org.example.inter.Aggregate;
import org.example.inter.Iterator;

import java.util.ArrayList;

/**
 * 表示书架的类
 */
public class BookShelf implements Aggregate {
    private ArrayList<Book> books = new ArrayList<Book>();
    private int last = 0;

    public Book getBookAt(int index){
        return this.books.get(index);
    }

    public void appendBook(Book book){
        this.books.add(book);
        last++;
    }

    public int getLength(){
        return last;
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
