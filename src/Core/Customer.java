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

    protected void editAccountInfo(String password, String address, String phoneNumber)
    {

    }

    protected void purchase()
    {

    }

    protected void addBookToCart(Book book)
    {
        if (cart == null)
        {
            Cart cart = new Cart(getUserName() + "-" + System.currentTimeMillis(), this);
            cart.addBook(book);
            this.cart = cart;
        }
        else
            cart.addBook(book);
    }

    protected void removeBookFromCart(Book book)
    {

    }

    protected void followFavouritePublishers(Publisher publisher)
    {

    }

    protected void unFollowFavouritePublishers(Publisher publisher)
    {

    }

    protected void addFavouriteBook(Book book)
    {

    }

    protected void removeFavourite(Book book)
    {

    }

    protected void addBookToBookMark(Book book)
    {

    }

    protected void removeBookFromBookMark(Book book)
    {

    }

    protected void scoreBook(Book book)
    {

    }

    protected void addCommentToBook(Book book)
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
