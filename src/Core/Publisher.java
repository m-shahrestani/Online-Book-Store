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

    protected void addBook(Book book)
    {
        books.add(book);
    }

    protected void removeBook(Book book)
    {

    }

    protected void increaseNumberOFBooks(Book book, int number)
    {

    }

    protected void decreaseNumberOFBooks(Book book, int number)
    {

    }

    protected void sell(Customer customer, Book book)
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

    protected void setCommission(int commission)
    {

    }

    protected void setDiscountConst(int discountConst)
    {

    }

    protected void editAccountInfo(String password, String address, String phoneNumber)
    {

    }

    public String getUserName()
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getAddress()
    {
        return address;
    }

    public int getSales()
    {
        return sales;
    }

    public HashMap<Customer, ArrayList<Book>> getCustomersInfo()
    {
        return customersInfo;
    }

    public ArrayList<Book> getBooks()
    {
        return books;
    }

    public double getCommission()
    {
        return commission;
    }

    public int getDiscountConst()
    {
        return discountConst;
    }
}
