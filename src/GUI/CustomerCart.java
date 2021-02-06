package GUI;

import Core.Book;
import Core.Cart;
import Core.Customer;
import Core.Server;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class CustomerCart extends JFrame
{
    private static final String ICON_PATH = "res/img/icon.png";
    private Server server;
    private ArrayList<JPanel> bookPanels;
    private Cart cart;
    private Customer customer;
    //Book panel includes a button and a book

    public CustomerCart(Server server, Customer customer)
    {
        setTitle(customer.getUserName() + " -Cart");
        ImageIcon icon = new ImageIcon(ICON_PATH);
        setIconImage(icon.getImage());

        this.server = server;
        bookPanels = new ArrayList<>();
        this.customer = customer;

        add(showCart());
        pack();
        setVisible(true);
    }

    public JLabel bookInformationLabel(String description){
        return new JLabel(description);
    }

    public JPanel bookPanelHeader(){
        JPanel bookPanelHeader = new JPanel(new GridLayout(1, 8));
        bookPanelHeader.add(bookInformationLabel("Book Name"));
        bookPanelHeader.add(bookInformationLabel("Publisher"));
        bookPanelHeader.add(bookInformationLabel("Author"));
        bookPanelHeader.add(bookInformationLabel("Age Rate"));
        bookPanelHeader.add(bookInformationLabel("Subject"));
        bookPanelHeader.add(bookInformationLabel("Edition"));
        bookPanelHeader.add(bookInformationLabel("Price"));
        return bookPanelHeader;
    }

    public JTextField bookInformationField(String information){
        JTextField bookInformationField = new JTextField(information, 8);
        bookInformationField.setEditable(false);
        return bookInformationField;
    }

    public JPanel bookPanel(Book book){
        JPanel bookPanel = new JPanel(new GridLayout(1, 8));
        bookPanel.add(bookInformationField(book.getName()));
        bookPanel.add(bookInformationField(book.getPublisher().getName()));
        bookPanel.add(bookInformationField(book.getAuthor()));
        bookPanel.add(bookInformationField(book.getAgeRate()));
        bookPanel.add(bookInformationField(book.getSubject()));
        bookPanel.add(bookInformationField(book.getEdition()));
        bookPanel.add(bookInformationField(String.valueOf(book.getPrice())));

        return bookPanel;
    }


    public JPanel showCart(){
        this.cart = customer.getCart();
        JPanel mainPanel = new JPanel();
        GridLayout gridLayout = new GridLayout();
        gridLayout.setColumns(1);
        gridLayout.setRows(20);
        gridLayout.setVgap(7);
        mainPanel.setLayout(gridLayout);
        int totalCost = 0;
        if (cart != null)
            totalCost = cart.getTotalCost();
        JLabel jLabel = new JLabel(" Total Cost : " + totalCost + "  ");
        JPanel jPanel = new JPanel();
        JButton buy = new JButton("Purchase");
        buy.addActionListener(e -> server.purchase(customer));
        jPanel.add(jLabel);
        jPanel.add(buy);
        mainPanel.add(jPanel);

        mainPanel.add(bookPanelHeader());
        if (cart != null) {
            for (int i = 0 ; i < cart.getBooks().size() ; i++){
                bookPanels.add(bookPanel(cart.getBooks().get(i)));
                mainPanel.add(bookPanels.get(i));
            }
        }
        return mainPanel;
    }
}