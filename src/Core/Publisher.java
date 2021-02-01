package Core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Publisher implements Serializable
{
    private String userName;
    private String password;
    private String name;
    private String phoneNumber;
    private String address;
    private int sales = 0;
    private HashMap<Customer, ArrayList<Book>> customersInfo;
    private ArrayList<Book> books;
    private double commission = 0.15;
    private int discountConst = 0;

    public Publisher(String userName, String password, String name, String phoneNumber, String address)
    {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        customersInfo = new HashMap<>();
        books = new ArrayList<>();
    }


    public void addBook(Book book)
    {

    }

    public void removeBook(Book book)
    {

    }

    public void changeCommission(int commission)
    {

    }

    public void sell(Customer customer, Book book)
    {

    }

    private int calculateDiscount(Customer customer)
    {
        return 0;
    }

    private ArrayList<Customer> sortBestCustomers()
    {
        return null;
    }

    public void setCommission(int commission)
    {

    }

    public void setDiscountConst(int discountConst)
    {

    }

    public void editAccountInfo(String password, String address, String phoneNumber)
    {

    }

//    public String getName()
//    {
//        return name;
//    }
//
//    public ArrayList<Book> getBooks()
//    {
//        return books;
//    }
}
