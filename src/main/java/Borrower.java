import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBookList;

    public Borrower(){
        this.borrowedBookList = new ArrayList<>();
    }

    public int getBorrowedBookList(){
        return this.borrowedBookList.size();
    }
    public void addBook(Book book){
        this.borrowedBookList.add(book);
    }

}
