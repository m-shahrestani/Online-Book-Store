package Core;

import GUI.BookStoreGUI;

import java.io.*;
import java.util.ArrayList;

public class Server
{
    //address
    private static final String CUSTOMER_PATH = "res/DataBase/customers.bin";
    private static final String PUBLISHER_PATH = "res/DataBase/publishers.bin";
    private static final String ADMIN_PATH = "res/DataBase/admins.bin";
    private static final String BOOKS_PATH = "res/DataBase/books.bin";
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
        loadDataBase();

        //look and feel
        try {
            javax.swing.UIManager.setLookAndFeel(com.jtattoo.plaf.texture.TextureLookAndFeel.class.getName());
        } catch (Exception ignored) {}
        BookStoreGUI bookStoreGUI = BookStoreGUI.getInstance(this);
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

        publisher.addBook(newBook);
        books.add(newBook);
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

    public int addPublisher(String userName, String password, String name, String phoneNumber, String address)
    {
        Publisher newPublisher = new Publisher(userName, password, name, phoneNumber, address);

        if (isDuplicateUserName(userName))
        {
            return 1;
        }
        else if (isDuplicatePhoneNumber(phoneNumber))
        {
            return 2;
        }
        publishers.add(newPublisher);

        return 0;
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
        saveAdminsToDatabase();
        saveBooksToDataBase();
        saveCustomersToDatabase();
        savePublishersToDatabase();
    }

    private void saveCustomersToDatabase()
    {
        try (FileOutputStream fs = new FileOutputStream(CUSTOMER_PATH )){
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(customers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void savePublishersToDatabase()
    {
        try (FileOutputStream fs = new FileOutputStream(PUBLISHER_PATH )){
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(publishers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveAdminsToDatabase()
    {
        try (FileOutputStream fs = new FileOutputStream(ADMIN_PATH )){
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(admins);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveBooksToDataBase()
    {
        try (FileOutputStream fs = new FileOutputStream(BOOKS_PATH )){
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadDataBase()
    {
        loadAdminsToServer();
        loadBooksToServer();
        loadCustomersToServer();
        loadPublishersToServer();
    }

    private void loadCustomersToServer()
    {
        try (FileInputStream fs = new FileInputStream(CUSTOMER_PATH)){
            ObjectInputStream os = new ObjectInputStream(fs);
            customers = (ArrayList<Customer>)os.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("cannot read");
            e.printStackTrace();
        }
    }

    private void loadPublishersToServer()
    {
        try (FileInputStream fs = new FileInputStream(PUBLISHER_PATH)){
            ObjectInputStream os = new ObjectInputStream(fs);
            publishers = (ArrayList<Publisher>)os.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("cannot read");
            e.printStackTrace();
        }
    }

    private void loadAdminsToServer()
    {
        try (FileInputStream fs = new FileInputStream(ADMIN_PATH)){
            ObjectInputStream os = new ObjectInputStream(fs);
            admins = (ArrayList<Admin>)os.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("cannot read");
            e.printStackTrace();
        }
    }

    private void loadBooksToServer()
    {
        try (FileInputStream fs = new FileInputStream(BOOKS_PATH)){
            ObjectInputStream os = new ObjectInputStream(fs);
            books = (ArrayList<Book>)os.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("cannot read");
            e.printStackTrace();
        }
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