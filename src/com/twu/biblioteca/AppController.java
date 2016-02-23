package com.twu.biblioteca;


import java.util.List;
import java.util.Scanner;

public class AppController {

    private OutPrint outPrintView = new OutPrint();
    private Scanner input = new Scanner(System.in);
    private Library library = new Library();
    private Users loginUser ;

    private static boolean status = true;
    private static int loginStatus = -1;


    public void startApplication(){

        outPrintView.startPrint();
        while(status) {
            if (loginStatus == -1){
                System.out.println("please login first!");
                System.out.println("for customer,you can login :userName1 userPassword1");
                System.out.println("for librarian,you can login :LibrarianName1 LibrarianPassword1");
                System.out.println("please enter your userName and your password:");
                login();
            }
            printOptions();
        }

    }

    public void printOptions()
    {
        outPrintView.printOptions(loginStatus);
        if (loginStatus == 0){
            status = selectOptionsAsCustomer(getSelectionBetween(1,8));
        }else {
            status = selectOptionsAsLibrarian(getSelectionBetween(1,5));
        }

    }

    private boolean selectOptionsAsCustomer(int selectNum){
        switch (selectNum){
            case 1:
                printBookList();
                break;
            case 2:
                printMovieList();
                break;
            case 3:
                checkOutBook();
                break;
            case 4:
                checkOutMovie();
                break;
            case 5:
                returnBook();
                break;
            case 6:
                showCustomerProfile();
                break;
            case 7:
                logOut();
                break;
            case 8:
                return false;
            default:
                return false;

        }
        return true;
    }


    private boolean selectOptionsAsLibrarian(int selectNum) {

        switch (selectNum){
            case 1:
                checkOutBook();
                break;
            case 2:
                returnBook();
                break;
            case 3:
                showAllRecords();
                break;
            case 4:
                logOut();
                break;
            case 5:
                return false;
            default:
                return false;
        }
        return true;
    }


    private void printBookList(){

        List<Book> bookList = library.getBookList();
        outPrintView.printBookList(bookList);
    }

    private void printMovieList(){

        List<Movie> movieList = library.getMovie();
        outPrintView.printMovieList(movieList);
    }
    private boolean checkOutBook(){
        System.out.print("please scanf the bookName:");
        String bookName = input.next();
        if (library.checkOutBookByBookName(loginUser,bookName)){
            System.out.println("Thank you ! enjoy the book"+bookName +"\n");

        }else {
            System.out.println("Sorry,that book " + bookName + " is not available"+"\n");
            return false;
        }
        return true;
    }

    private boolean checkOutMovie() {
        System.out.print("please scanf the movieName:");
        String movieName = input.next();
        if (library.checkOutBookByMovieName(movieName)){
            System.out.println("Thank you ! enjoy the movie"+movieName +"\n");

        }else {
            System.out.println("Sorry,that book " + movieName + " is not available"+"\n");
            return false;
        }
        return true;
    }

    private boolean returnBook(){
        System.out.print("please scanf the bookName:");
        String returnBookName = input.next();
        if (library.returnBookByBookName(loginUser,returnBookName)){
            System.out.println("Thank you for returning the book"+returnBookName +"\n");

        }else {
            System.out.println("Sorry,that book " + returnBookName + " is not a valid book to return\n");
            return false;
        }
        return true;

    }


    private void showCustomerProfile() {
        System.out.println(loginUser.getUserInfoByString());

    }

    private void login() {
        String userName = input.next();
        String password = input.next();
        if(library.useAccountLogin(userName,password)){
            loginStatus = library.getLoginStatus();
            loginUser = library.getLoginUser();
        }

        if (loginStatus == -1){
            System.out.println("your username or password is wrong,please try again!");
            login();
        }
    }

    private void logOut() {
        if (loginStatus == 0 || loginStatus == 1){
            loginStatus = -1;
            System.out.println("LogOut successed ,thank you !");
        }else {
            System.out.println("you haven't login yet!");
        }
    }

    private void showAllRecords() {
        library.printRecordList();
    }


    private int getSelectionBetween(int min ,int max){
        int selectNum = input.nextInt();
        while (selectNum < min && selectNum > max){
            System.out.print("Select a valid option");
            selectNum = input.nextInt();
        }
        return selectNum;
    }



}
