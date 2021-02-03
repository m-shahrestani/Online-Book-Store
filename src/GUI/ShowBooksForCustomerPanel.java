package GUI;

import Core.Book;
import Core.Customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class ShowBooksForCustomerPanel extends JPanel
{
    private ArrayList<Book> books;
    private ArrayList<JPanel> bookPanels;
    private Customer customer;
    //Book panel includes a button and a book

    public ShowBooksForCustomerPanel(ArrayList<Book> books,Customer customer)
    {
        this.books = books;
        bookPanels = new ArrayList<>();
        this.customer = customer;
    }
    public JLabel bookInformationLabel(String description){
        JLabel bookInformationLabel = new JLabel(description);
        return bookInformationLabel;
    }
    public JPanel bookPanelHeader(){
        JPanel bookPanelHeader = new JPanel(new GridLayout(1, 8));
        bookPanelHeader.add(bookInformationLabel("Book Name"));
        bookPanelHeader.add(bookInformationLabel("Publisher"));
        bookPanelHeader.add(bookInformationLabel("Author"));
        bookPanelHeader.add(bookInformationLabel("Age Rate"));
        bookPanelHeader.add(bookInformationLabel("Subject"));
        bookPanelHeader.add(bookInformationLabel("Edition"));
        bookPanelHeader.add(bookInformationLabel("Number"));
        bookPanelHeader.add(bookInformationLabel(""));
        return bookPanelHeader;
    }
    public JTextField bookInformationField(String information){
        JTextField bookInformationField = new JTextField(information, 10);
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
        bookPanel.add(bookInformationField(String.valueOf(book.getNumber())));
        //JButton jButton = new JButton("add to cart");
        //bookPanel.add(jButton);
        bookPanel.add(addButton(book));
        return bookPanel;
    }
    public void addToCart(Book book){
        customer.addBookToCart(book);
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

    public JPanel showAllBookForCustomer(){
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
}
