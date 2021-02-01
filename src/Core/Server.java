package Core;

import GUI.Login;

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
        Login login = new Login(server);
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

    public void addBook(Book book)
    {

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

    private void loadDataBase()
    {

    }
}
