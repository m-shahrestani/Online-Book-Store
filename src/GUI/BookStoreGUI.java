package GUI;

import Core.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BookStoreGUI extends JFrame
{
    //icon address
    private static final String ICON_PATH = "res/icon.png";
    //background picture address
    private static final String MAINmENU_PATH  = "res/background.jpg";
    //singleton instance
    private static BookStoreGUI INSTANCE = null;
    private Server server;
    private JButton publisherRegisterButton;
    private JButton customerRegisterButton;
    private JButton adminRegisterButton;
    private JButton loginButton;
    private JButton helpButton;
    private JButton aboutButton;
    private JButton exitButton;

    private BookStoreGUI(Server server)
    {
        ImageIcon icon = new ImageIcon(ICON_PATH);
        setIconImage(icon.getImage());
        setTitle("Online Book Store");
        setSize(750,336);
        setLocation(5, 5);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            super.windowClosing(e);
            server.saveDataBase();
            }
        });
        setResizable(false);

        this.server = server;
        publisherRegisterButton = new JButton("Publisher Register");
        customerRegisterButton = new JButton("Customer Register");
        adminRegisterButton = new JButton("Admin Register");
        loginButton = new JButton("Login");
        helpButton = new JButton("Help");
        aboutButton = new JButton("About");
        exitButton = new JButton("Exit");

        //mainPanel
        JPanel mainPanel = new JPanel();
        makePanel(mainPanel);

        add(mainPanel);

        setVisible(true);
    }

    /**
     * Create a new BookStoreGUI with singleton.
     *
     * @return INSTANCE.
     */
    public static BookStoreGUI getInstance(Server server) {
        if (INSTANCE == null)
            INSTANCE = new BookStoreGUI(server);
        return INSTANCE;
    }

    public void makePanel(JPanel mainPanel) {
        Color backgroundColor = new Color(1,1,1);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(backgroundColor);
        mainPanel.setBorder(BorderFactory.createLineBorder(backgroundColor));
        ImageIcon background = new ImageIcon(MAINmENU_PATH);
        Dimension size = new Dimension(background.getImage().getWidth(null), background.getImage().getHeight(null));
        mainPanel.setPreferredSize(size);
        mainPanel.setMinimumSize(size);
        mainPanel.setMaximumSize(size);
        mainPanel.setSize(size);
        JLabel label = new JLabel();
        label.setIcon(background);

        //fake panels
        JPanel fake1 = new JPanel();
        JPanel fake2 = new JPanel();
        JPanel fake3 = new JPanel();
        JPanel fake4 = new JPanel();
        JPanel fake5 = new JPanel();
        JPanel fake6 = new JPanel();
        JLabel fake7 = new JLabel("SEMM ©");
        fake7.setForeground(Color.white);
        //fake7.setFont();
        JPanel fake8 = new JPanel();
        JPanel fake9 = new JPanel();
        fake1.setBackground(backgroundColor);
        fake2.setBackground(backgroundColor);
        fake3.setBackground(backgroundColor);
        fake4.setBackground(backgroundColor);
        fake5.setBackground(backgroundColor);
        fake6.setBackground(backgroundColor);
        fake7.setBackground(backgroundColor);
        fake8.setBackground(backgroundColor);
        fake9.setBackground(backgroundColor);

        //panel1
        JPanel panel1 = new JPanel(new GridLayout(11, 1));
        panel1.setBackground(backgroundColor);
        loginButton.setFont(new Font("Arial", Font.BOLD, 15));
        loginButton.addActionListener(e -> loginGUI());
        customerRegisterButton.setFont(new Font("Arial", Font.BOLD, 15));
        customerRegisterButton.addActionListener(e -> customerRegisterGUI());
        publisherRegisterButton.setFont(new Font("Arial", Font.BOLD, 15));
        publisherRegisterButton.addActionListener(e -> publisherRegisterGUI());
        adminRegisterButton.setFont(new Font("Arial", Font.BOLD, 15));
        adminRegisterButton.addActionListener(e -> adminRegisterGUI());
        panel1.add(fake1);
        panel1.add(fake2);
        panel1.add(loginButton);
        panel1.add(fake3);
        panel1.add(customerRegisterButton);
        panel1.add(fake4);
        panel1.add(publisherRegisterButton);
        panel1.add(fake5);
        panel1.add(adminRegisterButton);
        panel1.add(fake6);
        panel1.add(fake7);

        //panel2
        JPanel panel2 = new JPanel(new GridLayout(1, 5));
        panel2.setBackground(backgroundColor);
        helpButton.setFont(new Font("Arial", Font.BOLD, 15));
        helpButton.addActionListener(e -> help());
        aboutButton.setFont(new Font("Arial", Font.BOLD, 15));
        aboutButton.addActionListener(e -> about());
        exitButton.setFont(new Font("Arial", Font.BOLD, 15));
        exitButton.addActionListener(e -> exit());
        panel2.add(exitButton);
        panel2.add(aboutButton);
        panel2.add(helpButton);
        panel2.add(fake8);
        panel2.add(fake9);

        mainPanel.add(label, BorderLayout.CENTER);
        mainPanel.add(panel1, BorderLayout.EAST);
        mainPanel.add(panel2, BorderLayout.NORTH);
    }

    private void loginGUI(){
        LoginGUI loginGUI = new LoginGUI(server);
    }

    private void customerRegisterGUI(){
        CustomerRegisterGUI customerRegisterGUI = new CustomerRegisterGUI(server);
    }

    private void publisherRegisterGUI(){
        PublisherRegisterGUI publisherRegisterGUI = new PublisherRegisterGUI(server);
    }

    private void adminRegisterGUI(){
        AdminRegisterGUI adminRegisterGUI = new AdminRegisterGUI(server);
    }

    private void help(){

    }

    private void about(){

    }

    private void exit(){
        server.saveDataBase();
        setVisible(false); //you can't see me!
        dispose();//Destroy the JFrame object
        System.exit(0);
    }
}
