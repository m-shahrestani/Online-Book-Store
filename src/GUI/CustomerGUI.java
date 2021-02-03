package GUI;

import Core.Book;
import Core.Customer;
import Core.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerGUI {
    Server server;
    Customer customer;
    JButton books;
    JButton cart;

    public CustomerGUI(Server server, Customer customer) {
        this.server = server;
        this.customer = customer;

        showFrame();
    }

    private void showFrame() {
        JFrame frame = new JFrame("Customer Panel");
        frame.setLayout(new FlowLayout());
        books = new JButton("books");
        cart = new JButton("cart");
        frame.add(books);
        frame.add(cart);
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
        frame.pack();
        frame.setVisible(true);
    }

    private void booksFrame(){
        JFrame jFrame = new JFrame("books");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ShowBooksForCustomerPanel showBooksForCustomerPanel = new ShowBooksForCustomerPanel(server.getBooks(),customer);
        jFrame.add(showBooksForCustomerPanel.showAllBookForCustomer());
        jFrame.pack();
        jFrame.setVisible(true);
    }
    private void cartFrame(){
        JFrame jFrame = new JFrame("cart");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        CustomerCartPanel customerCartPanel = new CustomerCartPanel(server.getBooks(),customer);
        jFrame.add(customerCartPanel.showCart());
        jFrame.pack();
        jFrame.setVisible(true);
    }
}