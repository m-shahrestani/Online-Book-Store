package GUI;

import Core.Book;
import Core.Customer;
import Core.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerGUI extends JFrame{
    Server server;
    Customer customer;
    JButton books;
    JButton cart;

    public CustomerGUI(Server server, Customer customer) {
        setTitle("Customer Panel");
        this.server = server;
        this.customer = customer;

        showFrame();
    }

    private void showFrame() {
        setLayout(new FlowLayout());
        books = new JButton("books");
        cart = new JButton("cart");
        add(books);
        add(cart);
        books.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                booksFrame();
            }
        });
        cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cartFrame();
            }
        });
        pack();
        setVisible(true);
    }

    private void booksFrame(){
        ShowBooksForCustomerPanel showBooksForCustomerPanel = new ShowBooksForCustomerPanel(server, customer);
    }
    private void cartFrame(){
        CustomerCartPanel customerCartPanel = new CustomerCartPanel(server, customer);
    }
}