package org.example;


import org.example.entity.Book;
import org.example.impl.BookShelf;
import org.example.inter.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("A_Book"));
        bookShelf.appendBook(new Book("B_Book"));
        bookShelf.appendBook(new Book("C_Book"));
        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}

