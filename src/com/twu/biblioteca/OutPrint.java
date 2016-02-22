package com.twu.biblioteca;

import java.util.List;

public class OutPrint {

    public static void startPrint(){
        System.out.println("**********************************************");
        System.out.println("*****Welcome to Bangalore Public Library******");
        System.out.println("**********************************************"+"\n");
    }

    public static void printBookList(List<Book> bookList){
        System.out.println("this is the bookList:");
        for (Book book: bookList){
            System.out.println(book.getBookName() + "\t" + book.getBookAuthor() + "\t" + book.getBookPublished());
        }

        System.out.println("\n");
    }

    public static void printOptions(){
        System.out.println("these are the options you can choose:");
        System.out.println("1.List Books");
        System.out.println("2.CheckOut Book");
        System.out.println("3.Return Book");
        System.out.println("4.Quit");
        System.out.println("please input your select:"+"\n");
    }
}
