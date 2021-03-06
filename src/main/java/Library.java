import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getBookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if (getBookCount() < this.capacity) {
            this.books.add(book);
        }
    }



}
