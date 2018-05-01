import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library();
        book = new Book();
    }

    @Test
    public void canGetBookCount(){
        assertEquals(0, library.getBookCount());
    }
    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }
}
