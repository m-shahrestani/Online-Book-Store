package Core;

import java.util.ArrayList;

public class Server
{
    ArrayList<Customer> customers;
    ArrayList<Publisher> publishers;
    ArrayList<Admin > admins;

    public Server()
    {
        customers = new ArrayList<>();
        publishers = new ArrayList<>();
        admins = new ArrayList<>();
    }

    public static void main(String[] args)
    {
        Server server = new Server();


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

    public void addCustomer()
    {

    }

    public void addPublisher()
    {

    }

    public void addAdmin()
    {

    }


}
