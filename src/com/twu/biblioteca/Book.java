package com.twu.biblioteca;


public class Book extends LibraryData {

    private String bookAuthor;
    private String bookPublished;

    public Book(String bookName, String bookAuthor,String bookPublished ){
        super(bookName);
        this.bookAuthor = bookAuthor;
        this.bookPublished = bookPublished;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublished() {
        return bookPublished;
    }

    public void setBookPublished(String bookPublished) {
        this.bookPublished = bookPublished;
    }



}
