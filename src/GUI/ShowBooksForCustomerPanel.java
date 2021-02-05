package GUI;

import Core.Book;
import Core.Customer;
import Core.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class ShowBooksForCustomerPanel extends JFrame
{
    //icon address
    private static final String ICON_PATH = "res/icon.png";
    private Server server;
    private ArrayList<Book> books;
    private ArrayList<JPanel> bookPanels;
    private Customer customer;

    public ShowBooksForCustomerPanel(Server server,Customer customer)
    {
        setTitle("Books");
        ImageIcon icon = new ImageIcon(ICON_PATH);
        setIconImage(icon.getImage());

        this.server = server;
        bookPanels = new ArrayList<>();
        this.customer = customer;
        JPanel panel = showAllBookForCustomer();

        add(panel);

        pack();
        setVisible(true);
    }
    public JLabel bookInformationLabel(String description){
        JLabel bookInformationLabel = new JLabel(description);
        return bookInformationLabel;
    }
    public JPanel bookPanelHeader(){
        JPanel bookPanelHeader = new JPanel(new GridLayout(1, 10));
        bookPanelHeader.add(bookInformationLabel("Book Name"));
        bookPanelHeader.add(bookInformationLabel("Publisher"));
        bookPanelHeader.add(bookInformationLabel("Author"));
        bookPanelHeader.add(bookInformationLabel("Age Rate"));
        bookPanelHeader.add(bookInformationLabel("Subject"));
        bookPanelHeader.add(bookInformationLabel("Edition"));
        bookPanelHeader.add(bookInformationLabel("Number"));
        bookPanelHeader.add(bookInformationLabel("price"));
        bookPanelHeader.add(bookInformationLabel(""));
        bookPanelHeader.add(bookInformationLabel(""));
        return bookPanelHeader;
    }
    public JTextField bookInformationField(String information){
        JTextField bookInformationField = new JTextField(information, 10);
        bookInformationField.setEditable(false);
        return bookInformationField;
    }
    public JPanel bookPanel(Book book){
        JPanel bookPanel = new JPanel(new GridLayout(1, 10));
        bookPanel.add(bookInformationField(book.getName()));
        bookPanel.add(bookInformationField(book.getPublisher().getName()));
        bookPanel.add(bookInformationField(book.getAuthor()));
        bookPanel.add(bookInformationField(book.getAgeRate()));
        bookPanel.add(bookInformationField(book.getSubject()));
        bookPanel.add(bookInformationField(book.getEdition()));
        bookPanel.add(bookInformationField(String.valueOf(book.getNumber())));
        bookPanel.add(bookInformationField(String.valueOf(book.getPrice())));
        //JButton jButton = new JButton("add to cart");
        //bookPanel.add(jButton);
        bookPanel.add(summeryButton(book));
        bookPanel.add(addButton(book));

        return bookPanel;
    }
    public JButton addButton(Book book){
        JButton add = new JButton("add to cart");
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addToCart(book);
            }
        });
        return add;
    }

    public JButton summeryButton(Book book){
        JButton add = new JButton("summery");
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bookSummery(book);
            }
        });
        return add;
    }
    public void bookSummery(Book book){
        JFrame summeryFrame = new JFrame(book.getName()+" Summery");
        JTextArea summery = new JTextArea(5, 20);
        summery.setText(book.getSummery());
        summeryFrame.add(summery);
        summeryFrame.setSize(500, 500);
        summeryFrame.setVisible(true);
    }
    public JPanel showAllBookForCustomer(){
        this.books = server.getBooks();
        JPanel mainPanel = new JPanel();
        GridLayout gridLayout = new GridLayout();
        gridLayout.setColumns(1);
        gridLayout.setRows(20);
        gridLayout.setVgap(7);
        mainPanel.setLayout(gridLayout);
        mainPanel.add(bookPanelHeader());
        for (int i = 0 ; i < books.size() ; i++){
            bookPanels.add(bookPanel(books.get(i)));
            mainPanel.add(bookPanels.get(i));
        }
        return mainPanel;
    }

    public void addToCart(Book book){
        server.customerAddBookToCart(customer, book);
    }
}
