package GUI;

import Core.Admin;
import Core.Server;

import javax.swing.*;

public class AdminGUI extends JFrame {
    Server server;
    Admin admin;

    public AdminGUI(Server server, Admin admin)
    {
        this.server = server;
        this.admin = admin;
    }
}
