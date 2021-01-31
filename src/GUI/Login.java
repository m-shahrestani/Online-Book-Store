package GUI;

import Core.Customer;
import Core.Server;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Login extends JFrame
{
    Server server;

    public Login(Server server, int mode)
    {
        this.server = server;

        JFrame frame = new JFrame();
        JButton jButton = new JButton("Hello");

        frame.add(jButton);
        jButton.addActionListener(
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        check();
                    }
                }
        );

        frame.setVisible(true);
    }


    public void check()
    {
        ArrayList<Customer> customers = server.getCustomers();
        
        if (textFiled.equal(user.name))
        {
            if (mode == 1)
                CustomerGUI customerGUI = new CustomerGUI(server);
            else if (mode == 2)
                PublisherGUI publisherGUI = new PublisherGUI(server);
        }

    }
}
