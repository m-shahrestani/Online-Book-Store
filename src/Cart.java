import java.util.ArrayList;

public class Cart {
    private ArrayList<Book> books;
    private int totalCost;
    private Customer customer;

    public Cart(Customer customer) {
        this.customer = customer;
        books = new ArrayList<>();
        totalCost = 0;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void deleteBook(Book book){
        books.remove(book);
    }
}
