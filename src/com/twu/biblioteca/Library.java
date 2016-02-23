package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList = new ArrayList<Book>();
    private List<Movie> movieList = new ArrayList<Movie>();
    private List<Users> userList = new ArrayList<Users>();
    private List<Users> librarianList = new ArrayList<Users>();
    private List<Records> recordsList = new ArrayList<Records>();
    private Users loginUser ;
    private int loginStatus;

    public Library(){
        for (int i = 0; i <10 ; i++) {
            bookList.add(new Book("bookName"+i,"bookAuthor"+i,"bookPublished"+i));
            movieList.add(new Movie("movieName"+i,"movieYear"+i,"movieRating"+i));
            userList.add(new Users("userName"+i,"userEmail"+i,"userAddress"+i,"userPhone"+i,"userPassword"+i));
            librarianList.add(new Users("librarianName"+i,"librarianEmail"+i,"librarianAddress"+i,"librarianPhone"+i,"librarianPassword"+i));
        }
    }

    public  List<Book>getBookList(){
        return bookList;
    }

    public List<Movie>getMovie(){
        return movieList;
    }

    public List<Users>getUserList(){
        return userList;
    }

    public List<Users>getLibrarianList()
    {
        return librarianList;
    }
    public Users getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(Users loginUser) {
        this.loginUser = loginUser;
    }

    public int getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(int loginStatus) {
        this.loginStatus = loginStatus;
    }

    public boolean useAccountLogin(String username,String userPassword){

        for (Users user:userList){
            if (user.getUserName().equals(username)&&user.getUserPassword().equals(userPassword)){
                System.out.println("welcome comeback"+username);
                loginUser = user;
                loginStatus = 0;
                return true;
            }
        }
        for (Users librarian :librarianList){
            if (librarian.getUserName().equals(username)&&librarian.getUserPassword().equals(userPassword)){
                System.out.println("welcome comeback "+username);
                loginUser = librarian;
                loginStatus = 1;
                return true;
            }
        }
        return false;

    }

    public boolean checkOutBookByBookName(Users user,String bookName){
        Book book = (Book)getDataClass( bookList,bookName);
        if (book!=null && book.checkOutByname()){
            Records record = new Records(user,book);
            addRecord(record);
            return true;
        }
        return false;
    }

    public boolean checkOutBookByMovieName(String movieName){

        Movie movie = (Movie) getDataClass( movieList,movieName);
        return movie!=null && movie.checkOutByname();
    }

    public boolean returnBookByBookName(Users user,String bookName){
        Book book = (Book)getDataClass( bookList,bookName);
        if (book!=null && book.returnBack()){
            Records record = new Records(user,book);
            removeRecord(record);
            return true;
        }
        return false;
    }

    private void addRecord(Records record){
        recordsList.add(record);
    }

    private void removeRecord(Records record){
        recordsList.remove(record);
    }

    public void printRecordList(){
        System.out.println("users\tcheckOut");
        for (Records record:recordsList){
            System.out.println(record.getUser().getUserName()+"\t"+record.getData().getName());
        }
    }

    private LibraryData getDataClass(List<?> list, String name){
        for (Object obj :list){
            LibraryData data = (LibraryData) obj;
            if (data.getName().equals(name)){
                return data;
            }
        }
        return null;
    }



}
