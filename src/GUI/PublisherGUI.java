package GUI;

import Core.Book;
import Core.Publisher;
import Core.Server;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PublisherGUI
{
    Server server;
    Publisher publisher;

    public PublisherGUI(Server server, Publisher publisher)
    {
        this.server = server;
        this.publisher = publisher;

        updateBooks();

        showFrame();
    }

    private void showFrame()
    {
        JFrame frame = new JFrame("Publisher Panel");

        JPanel publisherBooksPanel = new JPanel();
        JScrollPane publisherBooksScroll = new JScrollPane(publisherBooksPanel);

        JTextField bookNameField = new JTextField("Name");
        JTextField bookAuthorField = new JTextField("Author");
        JTextField bookEditionField = new JTextField("Edition");

        JButton addBookButton = new JButton("Add Book");

        addBookButton.addActionListener(
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        Book book = new Book(
                                bookNameField.getName(),
                                bookAuthorField.getText(),
                                bookEditionField.getText()
                        );
                        server.addBook(book);
                        publisher.addBook(book);
                        updateBooks();
                    }
                }
        );

        frame.add(publisherBooksScroll);
        frame.add(bookNameField);
        frame.add(bookAuthorField);
        frame.add(bookEditionField);
        frame.add(addBookButton);
        frame.setVisible(true);
    }

    public void updateBooks()
    {

    }
}
