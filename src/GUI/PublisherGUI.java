package GUI;

import Core.Publisher;
import Core.Server;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PublisherGUI extends JFrame
{
    private static final String userIcon  = "res/userIcon.png";
    private Server server;
    private Publisher publisher;

    public PublisherGUI(Server server, Publisher publisher)
    {
        setTitle(publisher.getName()+" Publisher");

        this.server = server;
        this.publisher = publisher;


        showFrame();
    }

    private void showFrame()
    {


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
        publisherInformation(addBookButton, showBooksButton);
        setSize(500, 500);
        setVisible(true);
    }

    public void publisherInformation(JButton addBookButton, JButton showBooksButton)
    {
        JPanel info= new JPanel(new FlowLayout(FlowLayout.LEFT));
        info.setBackground(Color.pink);
        ImageIcon icon = new ImageIcon(new ImageIcon(userIcon).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        JLabel iconLabel = new JLabel(icon);
        info.add(iconLabel);
        JLabel usernameLabel = new JLabel(publisher.getUserName());
        info.add(usernameLabel);
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        buttonPanel.add(addBookButton, gridBagConstraints);
        buttonPanel.add(showBooksButton, gridBagConstraints);
        add(info, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }
}
