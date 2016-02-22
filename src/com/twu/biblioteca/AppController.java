package com.twu.biblioteca;


import java.util.List;
import java.util.Scanner;

public class AppController {

    private OutPrint outPrintView = new OutPrint();
    private Scanner input = new Scanner(System.in);
    private Libiary libiary = new Libiary();

    public static boolean status = true;

    public static void main(String[] arg0){
        AppController app = new AppController();
        app.startApplication();
        app.printBookList();
        while(status) {
            app.printOptions();
        }
    }

    public void startApplication(){

        outPrintView.startPrint();

    }
    public void printBookList(){
        List<Book> bookList = libiary.createBookModel();
        outPrintView.printBookList(bookList);
    }

    public void printOptions()
    {
        outPrintView.printOptions();
        int selectNum = getSelectionBetween(1,4);
        status =  selectFromMainOptions(selectNum);
    }

    public boolean selectFromMainOptions(int selectNum){
        switch (selectNum){
            case 1:
                outPrintView.printBookList(new Libiary().createBookModel());
                break;
            case 2:
                System.out.print("please scanf the bookName:");
                String bookName = input.next();
                checkOutBook(bookName);
                break;
            case 3:
                System.out.print("please scanf the bookName:");
                String returnBookName = input.next();
                returnBook(returnBookName);
                break;
            case 4:
                return false;
            default:
                return false;

        }
        return true;
    }

    public boolean checkOutBook(String bookName){

        if (libiary.checkOutBookByBookName(bookName)){
            System.out.println("Thank you ! enjoy the book"+bookName +"\n");

        }else {
            System.out.println("Sorry,that book " + bookName + " is not available"+"\n");
            return false;
        }
        return true;
    }

    public boolean returnBook(String returnBookName){

        if (libiary.returnBookByBookName(returnBookName)){
            System.out.println("Thank you for returning the book"+returnBookName +"\n");

        }else {
            System.out.println("Sorry,that book " + returnBookName + " is not a valid book to return\n");
            return false;
        }
        return true;

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
