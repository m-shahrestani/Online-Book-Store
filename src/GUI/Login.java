package GUI;

import Core.Customer;
import Core.Server;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame
{
    Server server;

    public Login(Server server, int mode)
    {
        this.server = server;

        JFrame frame = new JFrame();
        JTextField nameField = new JTextField("Name");
        JTextField passField = new JTextField("Password");

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
                            new CustomerGUI(server, null);
                    }
                }
        );

        customerButton.addActionListener(
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        Customer publisher = server.getPublisher(nameField.getText());
                        if (publisher != null)
                            new PublisherGUI(server, publisher);
                        else
                            new PublisherGUI(server, null);

                    }
                }
        );

        frame.setVisible(true);
    }
}
