package Core;

import java.io.Serializable;
import java.util.ArrayList;

public class Cart implements Serializable
{
    private String id;
    private Customer customer;
    private ArrayList<Book> books;
    private int totalCost = 0;
    private boolean purchased = false;


    public Cart(String id, Customer customer)
    {
        this.id = id;
        this.customer = customer;
        books = new ArrayList<>();
    }

    public void addBook()
    {

    }

    public void removeBook()
    {

    }

    public void calculateTotalCost()
    {

    }

    public void buy()
    {

    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
