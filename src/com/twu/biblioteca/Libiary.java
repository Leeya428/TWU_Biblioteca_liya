package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Libiary {
    private List<Book> bookList = new ArrayList<Book>();

    public List<Book> createBookModel(){
        bookList.add(new Book("bookName1","bookAuthor1","bookPublished1"));
        bookList.add(new Book("bookName2","bookAuthor2","bookPublished2"));
        bookList.add(new Book("bookName3","bookAuthor3","bookPublished3"));
        bookList.add(new Book("bookName4","bookAuthor4","bookPublished4"));

        return bookList;
    }

    public boolean checkOutBookByBookName(String bookName){
        for (Book book:createBookModel()){
            if (book.getBookName().equals(bookName)){
                return true;
            }
        }
        return false;
    }

    public boolean returnBookByBookName(String bookName){
        for (Book book:createBookModel()){
            if (book.getBookName().equals(bookName)){
                return true;
            }
        }
        return false;
    }
}
