package Core;

import java.io.Serializable;
import java.util.ArrayList;

public class Order implements Serializable {
    private String ID;
    private ArrayList<Book> books;

    public Order(String ID) {
        this.ID = ID;
    }

    public void addBook(Book book) {

    }

    public void deleteBook(Book books) {

    }
}
