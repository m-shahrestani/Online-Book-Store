package GUI;

import Core.Book;
import Core.Customer;
import Core.Server;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerGUI
{
    Server server;
    Customer customer;

    public CustomerGUI(Server server, Customer customer)
    {
        this.server = server;
        this.customer = customer;

        showFrame();
    }

    private void showFrame()
    {
        JFrame frame = new JFrame("Customer Panel");

        JPanel databaseBooksPanel = new JPanel();
        JScrollPane databaseBooksScroll = new JScrollPane(databaseBooksPanel);
        JPanel cartPanel = new JPanel();
        JScrollPane cartScroll =  new JScrollPane(cartPanel);

        updateDatabaseBooksPanel(databaseBooksPanel);

        frame.add(cartPanel);
        frame.add(databaseBooksPanel);
        frame.setVisible(true);
    }

    public void updateDatabaseBooksPanel(JPanel databaseBooksPanel)
    {

    }

    public void updateCartPanel(JPanel cartPanel)
    {

    }
}

class AddToCartActionListener implements ActionListener
{
    Customer customer;
    Server server;
    Book book;

    public AddToCartActionListener(Server server, Customer customer, Book book)
    {
        this.customer = customer;
        this.server = server;
        this.book = book;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        server.addBook(book);
        customer.addBookToCart(book);
    }
}
