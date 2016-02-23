package com.twu.biblioteca;


public class Records{
    private Users user;
    private LibraryData data;

    public Records(Users user,LibraryData data){
        this.user = user;
        this.data = data;
    }


    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }


    public LibraryData getData() {
        return data;
    }

    public void setData(LibraryData data) {
        this.data = data;
    }
}
