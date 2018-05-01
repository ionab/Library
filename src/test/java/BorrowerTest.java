import org.junit.Before;
import org.junit.Test;

import java.util.function.BinaryOperator;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Book book;
    private Library library;
    private Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book();
        library = new Library(100);
    }

    @Test
    public void canTakeBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.getBorrowedBookList());
    }
}
