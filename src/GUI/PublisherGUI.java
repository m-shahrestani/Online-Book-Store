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

        showFrame();
    }

    private void showFrame()
    {
        JFrame frame = new JFrame("Publisher Panel");

        JTextField bookName = new JTextField("Name");
        JTextField bookAuthor = new JTextField("Author");
        JTextField bookEdition = new JTextField("Edition");

        JButton addBook = new JButton("Add Book");

        addBook.addActionListener(
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        server.addBook(
                                new Book(bookName.getName(),
                                bookAuthor.getText(),
                                bookEdition.getText())
                        );
                    }
                }
        );

        frame.setVisible(true);
    }

}
