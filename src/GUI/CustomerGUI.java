package GUI;

import Core.Customer;
import Core.Server;

import javax.swing.*;

public class CustomerGUI
{
    Server server;
    Customer customer;

    public CustomerGUI(Server server, Customer customer)
    {
        this.server = server;
        this.customer = customer;

        showFrame();
    }

    private void showFrame()
    {
        JFrame frame = new JFrame("Customer Panel");

        if (customer != null)

        frame.setVisible(true);
    }

}
