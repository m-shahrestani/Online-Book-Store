package GUI;

import Core.Book;
import Core.Customer;
import Core.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class CustomerGUI extends JFrame{
    Server server;
    Customer customer;
    JButton books;
    JButton cart;
    Image img = Toolkit.getDefaultToolkit().getImage("./bookstore.jpg");
    public void SwingDemo() throws IOException {

    }
    public CustomerGUI(Server server, Customer customer) {
        setTitle("Customer Panel");
        this.server = server;
        this.customer = customer;

        showFrame();
    }

    private void showFrame() {
        setPreferredSize(new Dimension(640,517));

        this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(img, 0, 0, null);
            }
        });

        pack();
        setVisible(true);

        JLabel jLabel = new JLabel(customer.getUserName());
        add(jLabel);

        Icon booksIcon = new ImageIcon("./books.jpg");
        books = new JButton(booksIcon);

        Icon cartIcon = new ImageIcon("./cart2.jpg");
        cart = new JButton(cartIcon);

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