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
    private static final String ICON_PATH = "res/icon.png";
    private static final String Background_PATH = "res/bookstore.jpg";
    private static final String SHOW_BOOK_PATCH = "res/books.jpg";
    private static final String SHOW_CART_PATH = "res/cart.jpg";
    private static final String userIcon  = "res/userIcon.png";
    private Server server;
    private Customer customer;
    private JButton books;
    private JButton cart;
    private Image img = Toolkit.getDefaultToolkit().getImage(Background_PATH);


    public CustomerGUI(Server server, Customer customer) {
        setTitle(customer.getUserName() + " -Customer");
        ImageIcon icon = new ImageIcon(ICON_PATH);
        setIconImage(icon.getImage());

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
        setLayout(new BorderLayout());
        setResizable(false);
        JPanel info= new JPanel(new FlowLayout(FlowLayout.LEFT));
        info.setBackground(Color.LIGHT_GRAY);
        ImageIcon icon = new ImageIcon(new ImageIcon(userIcon).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        JLabel iconLabel = new JLabel(icon);
        info.add(iconLabel);
        JLabel usernameLabel = new JLabel(customer.getUserName());
        info.add(usernameLabel);
        add(info,BorderLayout.NORTH);

        pack();
        setVisible(true);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.DARK_GRAY);
        Icon showBooks = new ImageIcon(SHOW_BOOK_PATCH);
        books = new JButton(showBooks);

        Icon cartIcon = new ImageIcon(SHOW_CART_PATH);
        cart = new JButton(cartIcon);

        buttonPanel.add(books);
        buttonPanel.add(cart);

        add(buttonPanel,BorderLayout.SOUTH);
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