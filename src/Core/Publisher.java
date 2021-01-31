package Core;

import java.io.Serializable;
import java.util.ArrayList;

public class Publisher implements Serializable {
    private String name;
    private String username;
    private String password;
    private int sales;
    private ArrayList<Book> books;
    private ArrayList<Customer> previousCustomers;

    public Publisher(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public void addBook(Book book) {

    }

    public void deleteBook(Book books) {

    }

    public void sales(int money) {
        sales += money;
    }

}
