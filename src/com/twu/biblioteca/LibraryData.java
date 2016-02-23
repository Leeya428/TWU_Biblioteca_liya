package com.twu.biblioteca;

public class LibraryData {
    private String name;
    private boolean available;

    public LibraryData(String name){
        this.name = name;
        available = true;
    }

    public boolean checkOutByname(){
        if (available){
            available = false;
            return true;
        }
        return false;
    }

    public boolean returnBack(){
        if(available){
            return false;
        }
        available = true;
        return true;
    }

    public boolean isAvailable(){
        return available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
