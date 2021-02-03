package GUI;

import Core.Book;
import Core.Publisher;
import Core.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PublisherGUI extends JFrame
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
        frame.setLayout(new FlowLayout());

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
                        publisherBooksPanel.removeAll();
                        publisherBooksPanel.revalidate();
                        publisherBooksPanel.repaint();
                        PublisherAddBookPanel publisherAddBookPanel = new PublisherAddBookPanel();
                        add(publisherAddBookPanel);
                        publisherAddBookPanel.updateUI();
                        revalidate();
                        repaint();
                        server.addBook(publisherAddBookPanel.getNameTextField(), publisher, publisherAddBookPanel.getAuthorTextField(), publisherAddBookPanel.getAgeRateTextField(), publisherAddBookPanel.getSubjectTextField(), publisherAddBookPanel.getEditionTextField(), publisherAddBookPanel.getPriceTextField(), publisherAddBookPanel.getNumberTextField(), publisherAddBookPanel.getSummeryTextArea());
                        //publisher.addBook(book);
                        //updateBooks();
                    }
                }
        );

        frame.add(publisherBooksScroll);
        frame.add(bookNameField);
        frame.add(bookAuthorField);
        frame.add(bookEditionField);
        frame.add(addBookButton);

        frame.pack();
        frame.setVisible(true);
    }

    public void updateBooks()
    {

    }
}
