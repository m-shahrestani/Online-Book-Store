package GUI;

import Core.Book;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShowBooksForCustomerPanel
{
    private ArrayList<Book> books;
    private ArrayList<JPanel> bookPanels;
    //Book panel includes a button and a book

    public ShowBooksForCustomerPanel(ArrayList<Book> books)
    {
        this.books = books;
    }

    public JPanel createPanelForEachBook(Book book , JButton button){
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.gray);
        jPanel.setPreferredSize(new Dimension(200,90));
        //info
        String info = book.getName()+" "+book.getAuthor()+" "+book.getPublisher()+" "+book.getPrice();
        JLabel jLabel = new JLabel(info);
        Font font=new Font("Verdana",Font.BOLD,12);
        jLabel.setFont(font);
        jLabel.setForeground(Color.white);
        jLabel.setBackground(Color.LIGHT_GRAY);
        //button
        jPanel.add(jLabel);
        jPanel.add(button);
        return jPanel;
    }


}
