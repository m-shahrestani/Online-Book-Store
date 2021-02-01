package GUI;

import Core.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookStoreGUI extends JFrame
{
    Server server;

    public BookStoreGUI(Server server)
    {
        this.server = server;

        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());

        JButton publisherRegisterButton = new JButton("Publisher Register");
        JButton customerRegisterButton = new JButton("Customer Register");
        JButton adminRegisterButton = new JButton("Admin Register");
        JButton loginButton = new JButton("Login");

        frame.add(publisherRegisterButton);
        frame.add(customerRegisterButton);
        frame.add(adminRegisterButton);
        frame.add(loginButton);

        publisherRegisterButton.addActionListener(
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        new PublisherRegisterGUI(server);
                    }
                }
        );

        customerRegisterButton.addActionListener(
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        new CustomerRegisterGUI(server);
                    }
                }
        );

        loginButton.addActionListener(
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        new LoginGUI(server);
                    }
                }
        );

        frame.pack();
        frame.setVisible(true);
    }
}
