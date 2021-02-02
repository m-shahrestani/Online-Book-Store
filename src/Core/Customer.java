package Core;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer implements Serializable
{
    private String userName;
    private String password;
    private String phoneNumber;
    private String address;
    private int credit = 0;
    private Cart cart;
    private ArrayList<Publisher> favouritesPublishers;
    private ArrayList<Book> favouriteBooks;
    private ArrayList<Book> bookMarkedBooks;
    private ArrayList<Cart> carts;

    public Customer(String userName, String password, String phoneNumber, String address)
    {
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        favouritesPublishers = new ArrayList<>();
        favouriteBooks = new ArrayList<>();
        bookMarkedBooks = new ArrayList<>();
        carts = new ArrayList<>();
    }

    public void editAccountInfo(String password, String address, String phoneNumber)
    {

    }

    public void purchase()
    {

    }

    public void addBookToCart(Book book)
    {
        if (cart == null)
        {
            Cart cart = new Cart("1", this);
            cart.addBook(book);
        }
        else
            cart.addBook(book);
    }

    public void removeBookFromCart(Book book)
    {

    }

    public void followFavouritePublishers(Publisher publisher)
    {

    }

    public void unFollowFavouritePublishers(Publisher publisher)
    {

    }



    public void addFavouriteBook(Book book)
    {

    }

    public void removeFavourite(Book book)
    {

    }

    public void addBookToBookMark(Book book)
    {

    }

    public void removeBookFromBookMark(Book book)
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

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getAddress()
    {
        return address;
    }

    public int getCredit()
    {
        return credit;
    }

    public Cart getCart()
    {
        return cart;
    }

    public ArrayList<Publisher> getFavouritesPublishers()
    {
        return favouritesPublishers;
    }

    public ArrayList<Book> getFavouriteBooks()
    {
        return favouriteBooks;
    }

    public ArrayList<Book> getBookMarkedBooks()
    {
        return bookMarkedBooks;
    }

    public ArrayList<Cart> getCarts()
    {
        return carts;
    }
}
