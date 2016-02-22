package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void test() {
        assertEquals(1, 1);
    }


    @Test
    public void check_out_the_book_in_the_libiary_should_return_true(){
        AppController app = new AppController();
        assertEquals(true,app.checkOutBook("bookName1"));
    }

    @Test
    public void check_out_the_book_out_of_the_libiary_should_return_false(){
        AppController app = new AppController();
        assertEquals(false,app.checkOutBook("book"));
    }

    @Test
    public void return_book_in_the_libiary_should_return_true(){
        AppController app = new AppController();
        assertEquals(true,app.returnBook("bookName1"));
    }
    @Test
    public void return_book_out_of_the_libiary_should_return_false(){
        AppController app = new AppController();
        assertEquals(false,app.returnBook("book"));
    }
}
