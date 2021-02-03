package GUI;

import Core.Book;
import Core.Customer;
import Core.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerGUI
{
    Server server;
    Customer customer;
    JButton books ;
    JButton cart;

    public CustomerGUI(Server server, Customer customer)
    {
        this.server = server;
        this.customer = customer;

        showFrame();
    }

    private void showFrame()
    {
        JFrame frame = new JFrame("Customer Panel");
        frame.setLayout(new FlowLayout());

       
        frame.pack();
        frame.setVisible(true);
    }

    public void updateDatabaseBooksPanel(JPanel databaseBooksPanel)
    {


        //databaseBooksPanel.setLayout (new BoxLayout (,));
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
        //server.addBook();
        customer.addBookToCart(book);
    }
}
