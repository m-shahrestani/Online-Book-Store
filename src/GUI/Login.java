package GUI;

import Core.Customer;
import Core.Publisher;
import Core.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame
{
    Server server;

    public Login(Server server)
    {
        this.server = server;

        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());

        JTextField nameField = new JTextField("Name", 10);
        JTextField passField = new JTextField("Password", 10);

        JButton customerButton = new JButton("Customer");
        JButton AuthorButton = new JButton("Author");

        frame.add(customerButton);
        frame.add(AuthorButton);
        frame.add(nameField);
        frame.add(passField);

        customerButton.addActionListener(
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        Customer customer = server.getCustomer(nameField.getText());
                        if (customer != null)
                            new CustomerGUI(server, customer);
                        else
                        {
                            Customer newCustomer = new Customer(nameField.getText());
                            new CustomerGUI(server, newCustomer);
                        }
                    }
                }
        );

        AuthorButton.addActionListener(
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        Publisher publisher = server.getPublisher(nameField.getText());
                        if (publisher != null)
                            new PublisherGUI(server, publisher);
                        else
                        {
                            Publisher newPublisher = new Publisher(nameField.getText());
                            new PublisherGUI(server, newPublisher);
                        }

                    }
                }
        );

        frame.pack();
        frame.setVisible(true);
    }
}
