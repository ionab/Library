import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;



    @Before
    public void before() {
        library = new Library(100);
        book = new Book();
    }

    @Test
    public void canGetBookCount(){
        assertEquals(0, library.getBookCount());
    }
    @Test
    public void canAddBook_capacity(){
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void cantAddBookLibraryFull(){
        for (int i = 0; i<101; i++){
            library.addBook(book);
        }
        assertEquals(100, library.getBookCount());

    }
}


