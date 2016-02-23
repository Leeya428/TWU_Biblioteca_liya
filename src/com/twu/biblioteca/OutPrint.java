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
            System.out.println(book.getName() + "\t" + book.getBookAuthor() + "\t" + book.getBookPublished());
        }

        System.out.println("\n");
    }

    public static void printMovieList(List<Movie> movieList){
        System.out.println("this is the movieList:");
        for (Movie movie: movieList){
            System.out.println(movie.getName() + "\t" + movie.getMovieYear() + "\t" + movie.getMovieRating());
        }

        System.out.println("\n");
    }

    public static void printOptions(int loginStatus){
        switch (loginStatus){
            case 0:
                System.out.println("these are the options you can choose:");
                System.out.println("1.List Books");
                System.out.println("2.List Movie");
                System.out.println("3.CheckOut Book");
                System.out.println("4.CheckOut Movie");
                System.out.println("5.Return Book");
                System.out.println("6.Show My profile");
                System.out.println("7.Login out");
                System.out.println("8.Quit");
                System.out.println("please input your select:");
                break;
            case 1:
                System.out.println("these are the options you can choose:");
                System.out.println("1.CheckOut Book");
                System.out.println("2.Return Book");
                System.out.println("3.Show All Checkout Info");
                System.out.println("4.Login out");
                System.out.println("5.Quit");
                System.out.println("please input your select:");

        }

    }
}
