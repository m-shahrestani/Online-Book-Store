package GUI;

import Core.Publisher;
import Core.Server;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PublisherGUI extends JFrame
{
    Server server;
    Publisher publisher;

    public PublisherGUI(Server server, Publisher publisher)
    {
        setTitle("Publisher");

        this.server = server;
        this.publisher = publisher;

        updateBooks();
        showFrame();
    }

    private void showFrame()
    {
        JPanel mainPanel = new JPanel();

        JButton addBookButton = new JButton("Add Book");

        addBookButton.addActionListener(
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        PublisherAddBookPanel publisherAddBookPanel = new PublisherAddBookPanel(server, publisher);
                    }
                }
        );

        JButton showBooksButton = new JButton("Show my books");
        showBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowBooksForPublisherPanel showBooksForPublisherPanel = new ShowBooksForPublisherPanel(publisher);
            }
        });
        mainPanel.add(addBookButton);
        mainPanel.add(showBooksButton);
        add(mainPanel);

        pack();
        setVisible(true);
    }

    public void updateBooks()
    {

    }
}
