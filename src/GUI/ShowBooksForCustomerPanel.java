package GUI;

import Core.Book;

import javax.swing.*;
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

}
