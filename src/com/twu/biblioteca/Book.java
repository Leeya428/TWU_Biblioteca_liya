package com.twu.biblioteca;


public class Book {
    private String bookName;
    private String bookAuthor;
    private String bookPublished;



    public Book(String bookName, String bookAuthor,String bookPublished ){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublished = bookPublished;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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
