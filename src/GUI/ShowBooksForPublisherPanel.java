package GUI;

import Core.Book;

import javax.swing.*;
import java.util.ArrayList;

public class ShowBooksForPublisherPanel
{
    private ArrayList<Book> books;
    private ArrayList<JPanel> bookPanels;
    //Book panel includes a book

    public ShowBooksForPublisherPanel(ArrayList<Book> books)
    {
        this.books = books;
    }
}
