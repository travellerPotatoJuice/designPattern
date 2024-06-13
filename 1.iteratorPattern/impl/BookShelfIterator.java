package org.example.impl;


import org.example.entity.Book;
import org.example.inter.Iterator;

/**
 * 表示书架迭代器的类
 */
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
    }
    @Override
    public boolean hasNext() {
        return this.index < this.bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
