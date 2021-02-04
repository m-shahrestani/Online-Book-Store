package Core;

import GUI.BookStoreGUI;

import java.util.ArrayList;

public class Server
{
    private ArrayList<Customer> customers;
    private ArrayList<Publisher> publishers;
    private ArrayList<Admin> admins;
    private ArrayList<Book> books;

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
        //look and feel
        try {
            javax.swing.UIManager.setLookAndFeel(com.jtattoo.plaf.texture.TextureLookAndFeel.class.getName());
        } catch (Exception ignored) {}
        BookStoreGUI bookStoreGUI = BookStoreGUI.getInstance(server);
    }

    //Server Methods

    public void addBook(String name, Publisher publisher, String author, String ageRate, String subject, String edition, int price, int number, String summery)
    {
        Book newBook = new Book(name, publisher, author, ageRate, subject, edition, price, number, summery);

        for (Book book : books)
        {
            if (newBook.equals(book))
                return;
        }

        books.add(newBook);
        publisher.addBook(newBook);
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

    }

    public void addComment(Book book, String comment)
    {

    }

    public int addCustomer(String userName, String password, String phoneNumber, String address)
    {
        Customer newCustomer = new Customer(userName, password, phoneNumber, address);

        if (isDuplicateUserName(userName))
        {
            return 1;
        }
        else if (isDuplicatePhoneNumber(phoneNumber))
        {
            return 2;
        }
        customers.add(newCustomer);

        return 0;
    }

    public void addPublisher(String userName, String password, String name, String phoneNumber, String address)
    {
        Publisher newPublisher = new Publisher(userName, password, name, phoneNumber, address);
        if (!isDuplicateUserName(userName))
        {
            publishers.add(newPublisher);
        }
    }

    public void addAdmin(String userName, String password, Server server)
    {
        Admin newAdmin = new Admin(userName, password, server);

        if (!isDuplicateUserName(userName))
        {
            admins.add(newAdmin);
        }
    }

    private boolean isDuplicateUserName(String userName)
    {
        for (Customer customer : customers)
        {
            if (customer.getUserName().equals(userName))
            {
                return true;
            }
        }

        for (Publisher publisher : publishers)
        {
            if (publisher.getUserName().equals(userName))
            {
                return true;
            }
        }

        for (Admin admin : admins)
        {
            if (admin.getUserName().equals(userName))
            {
                return true;
            }
        }

        return false;
    }

    private boolean isDuplicatePhoneNumber(String phoneNumber)
    {
        for (Customer customer : customers)
        {
            if (customer.getPhoneNumber().equals(phoneNumber))
            {
                return true;
            }
        }

        for (Publisher publisher : publishers)
        {
            if (publisher.getPhoneNumber().equals(phoneNumber))
            {
                return true;
            }
        }

        return false;
    }

    public void saveDataBase()
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

    public void loadDataBase()
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

    }

    public void purchase(Customer customer)
    {

    }

    public void customerAddBookToCart(Customer customer, Book book)
    {
        customer.addBookToCart(book);
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

    public void customerScoreBook(Book book)
    {

    }

    public void customerAddCommentToBook(Book book)
    {

    }

    public Customer customerLogin(String userName, String password)
    {
        for (Customer customer : customers)
        {
            if (userName.equals(customer.getUserName()) && password.equals(customer.getPassword()))
            {
                return customer;
            }
        }
        return null;
    }

    //Publisher Methods

    public void publisherAddBook(String name, Publisher publisher, String author, String ageRate, String subject, String edition, int price, int number, String summery)
    {
        Book newBook = new Book(name, publisher, author, ageRate, subject, edition, price, number, summery);
        publisher.addBook(newBook);
    }

    public void publisherRemoveBook(Publisher publisher, Book book)
    {

    }

    public void publisherIncreaseNumberOFBooks(Book book)
    {

    }

    public void publisherDecreaseNumberOFBooks(Book book)
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

    public Publisher publisherLogin(String userName, String password)
    {
        for (Publisher publisher : publishers)
        {
            if (userName.equals(publisher.getUserName()) && password.equals(publisher.getPassword()))
            {
                return publisher;
            }
        }
        return null;
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

    public Admin adminLogin(String userName, String password)
    {
        for (Admin admin : admins)
        {
            if (userName.equals(admin.getUserName()) && password.equals(admin.getPassword()))
            {
                return admin;
            }
        }
        return null;
    }

    //Server Getters

    public ArrayList<Book> getBooks()
    {
        return  books;
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
