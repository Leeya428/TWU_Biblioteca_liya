package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    private AppController app;
    private Library library;
    private Users user;
    private Users librarian;
    @Before
    public void startTest(){
        app = new AppController();
        library = new Library();
        user = new Users("userName1","userEmail1","userAddress","userPhone1","userPassword");

    }

    @Test
    public void check_out_the_book_in_the_library_should_return_true(){
        assertEquals(true,library.checkOutBookByBookName(user,"bookName1"));
    }

    @Test
    public void check_out_the_book_out_of_the_library_should_return_false(){
        assertEquals(false,library.checkOutBookByBookName(user,"book1"));
    }
    @Test
    public void check_out_book_that_has_been_checked_out_should_return_false(){
        library.checkOutBookByBookName(user,"bookName1");
        assertEquals(false,library.checkOutBookByBookName(user,"bookName1"));
    }

    @Test
    public void return_book_in_the_library_should_return_true(){
        library.checkOutBookByBookName(user,"bookName1");
        assertEquals(true,library.returnBookByBookName(user,"bookName1"));
    }
    @Test
    public void return_book_out_of_the_library_should_return_false(){
        assertEquals(false,library.returnBookByBookName(user,"book1"));
    }

    @Test
    public void return_book_that_has_not_been_checked_out_should_return_false(){
        assertEquals(false,library.returnBookByBookName(user,"bookName2"));
    }

    @Test
    public void check_out_the_movie_in_the_library__should_return_true(){
        assertEquals(true,library.checkOutBookByMovieName("movieName1"));
    }

    @Test
    public void use_useName1_userPassword1_login_should_return_true(){
        assertEquals(true,library.useAccountLogin("userName1","userPassword1"));
    }

    @Test
    public void use_account_not_in_the_library_should_return_false(){
        assertEquals(false,library.useAccountLogin("user","user"));
    }
    @Test
    public void use_librarianName1_librarianPassword1_login_should_return_true(){
        assertEquals(true,library.useAccountLogin("librarianName1","librarianPassword1"));
    }
    @Test
    public void use_librarian_Account_not_in_the_library_should_return_false(){
        assertEquals(false,library.useAccountLogin("user","user"));
    }

}
