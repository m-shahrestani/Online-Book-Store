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

    public Cart getCart()
    {
        return cart;
    }
}
