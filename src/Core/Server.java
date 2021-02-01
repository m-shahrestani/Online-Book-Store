package Core;

import GUI.BookStoreGUI;

import java.util.ArrayList;

public class Server
{
    ArrayList<Customer> customers;
    ArrayList<Publisher> publishers;
    ArrayList<Admin> admins;
    ArrayList<Book> books;

    public Server()
    {
        customers = new ArrayList<>();
        publishers = new ArrayList<>();
        admins = new ArrayList<>();
        books = new ArrayList<>();
    }

    public static void main(String[] args)
    {
        Server server = new Server();
        server.loadDataBase();
        BookStoreGUI bookStoreGUI = new BookStoreGUI(server);
    }

    //

    public void addBook(String name, Publisher publisher, String author, String ageRate, String subject, String edition, int price, int number, String summery)
    {
        Book book = new Book(name, publisher, author, ageRate, subject, edition, price, number, summery);
        books.add(book);
        publisher.addBook(book);
    }

    public void sellCart(Cart cart)
    {

    }

    public void decideMessage(Customer customer)
    {

    }

    public void message(String phoneNumber, String message)
    {

    }

    public void addScoreToBook(Book book, int score)
    {
        book.addScore(score);
    }

    public void addComment(Book book, String comment)
    {
        book.addComment(comment);
    }

    public void addCustomer(Customer customer)
    {

    }

    public void addPublisher()
    {

    }

    public void addAdmin()
    {

    }


    private void saveDataBase()
    {

    }

    private void saveCustomersToDatabase()
    {

    }

    private void savePublishersToDatabase()
    {

    }

    private void saveAdminsToDatabase()
    {

    }

    private void saveBooksToDataBase()
    {

    }

    private void loadDataBase()
    {

    }

    private void loadCustomersToServer()
    {

    }

    private void loadPublishersToServer()
    {

    }

    private void loadAdminsToServer()
    {

    }

    private void loadBooksToServer()
    {

    }

    //Customer Methods

    public void customerEditAccountInfo(Customer customer, String password, String address, String phoneNumber)
    {
        customer.editAccountInfo(password, address, phoneNumber);
    }

    public void purchase(Customer customer)
    {
        customer.purchase();
        Cart cart = customer.getCart();
    }

    public void customerAddBookToCart(Customer customer, Book book)
    {

    }

    public void customerRemoveBookFromCart(Customer customer, Book book)
    {

    }

    public void customerFollowFavouritePublishers(Customer customer, Publisher publisher)
    {

    }

    public void customerUnFollowFavouritePublishers(Customer customer, Publisher publisher)
    {

    }

    public void customerAddFavouriteBook(Customer customer, Book book)
    {

    }

    public void customerRemoveFavourite(Customer customer, Book book)
    {

    }

    public void customerAddBookToBookMark(Customer customer, Book book)
    {

    }

    public void customerRemoveBookFromBookMark(Customer customer, Book book)
    {

    }

    //Publisher Methods

    public void publisherAddBook(Publisher publisher, Book book)
    {

    }

    public void publisherRemoveBook(Publisher publisher, Book book)
    {

    }

    public void publisherSetCommission(Publisher publisher, int commission)
    {

    }

    public void publisherSetDiscountConst(Publisher publisher, int discountConst)
    {

    }

    public void publisherEditAccountInfo(Publisher publisher, String password, String address, String phoneNumber)
    {

    }

    //Admin Methods


    public void adminViewSalesInfo()
    {

    }

    public void adminChangeCommission(Publisher publisher, int Commission)
    {

    }

    public void adminSortBestPublishers()
    {

    }

    public Customer getCustomer(String name)
    {
        return null;
    }

    public Publisher getPublisher(String name)
    {
        return null;
    }

    public ArrayList<Book> getBooks()
    {
        return  null;
    }

    public ArrayList<Customer> getCustomers()
    {
        return customers;
    }

    public ArrayList<Admin> getAdmins()
    {
        return admins;
    }

    public ArrayList<Publisher> getPublishers()
    {
        return publishers;
    }
}
