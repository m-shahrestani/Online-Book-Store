package GUI;

import Core.Admin;
import Core.Server;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AdminRegisterGUI extends JFrame
{
    //icon address
    private static final String ICON_PATH = "res/icon.png";
    private Server server;
    private JTextField userNameTextField;
    private JPasswordField passwordTextField;
    private JButton signUp;
    private JButton back;

    public AdminRegisterGUI(Server server)
    {
        ImageIcon icon = new ImageIcon(ICON_PATH);
        setIconImage(icon.getImage());
        setTitle("Admin Register");
        setSize(700,400);
        setLocation(300, 200);
        setResizable(false);

        this.server = server;
        userNameTextField = new JTextField(20);
        passwordTextField = new JPasswordField(20);
        signUp = new JButton("Sign up");
        back = new JButton("Back");

        //make main panel
        JPanel mainPanel = new JPanel();
        makeMainPanel(mainPanel);

        //add panels
        JPanel fake1 = new JPanel();
        fake1.setPreferredSize(new Dimension(200,50));
        JPanel fake2 = new JPanel();
        fake2.setPreferredSize(new Dimension(200,50));
        JPanel fake3 = new JPanel();
        fake3.setPreferredSize(new Dimension(50,90));
        JPanel fake4 = new JPanel();
        fake4.setPreferredSize(new Dimension(50,90));
        Color backgroundColor = new Color(12,21,20);
        fake1.setBackground(backgroundColor);
        fake2.setBackground(backgroundColor);
        fake3.setBackground(backgroundColor);
        fake4.setBackground(backgroundColor);
        add(fake1, BorderLayout.WEST);
        add(fake2, BorderLayout.EAST);
        add(fake3, BorderLayout.NORTH);
        add(fake4, BorderLayout.SOUTH);
        add(mainPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void makeMainPanel(JPanel mainPanel){
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(new TitledBorder( new LineBorder(new Color(20,20,20)), "Admin Register"));

        //user panel
        JPanel userPanel = new JPanel();
        makeUserPanel(userPanel);
        //pass panel
        JPanel passPanel = new JPanel();
        makePassPanel(passPanel);
        //button panel
        JPanel buttonPanel = new JPanel();
        makeButtonPanel(buttonPanel);

        //add panels to main panel
        mainPanel.add(userPanel);
        mainPanel.add(passPanel);
        mainPanel.add(buttonPanel);
    }

    private void makeUserPanel(JPanel userPanel) {
        JLabel userNameLabel = new JLabel(" Username", SwingConstants.LEFT);
        userPanel.setLayout(new GridLayout(1,2));
        JPanel userPanel1 = new JPanel();
        userPanel1.setLayout(new GridLayout(2,1));
        userPanel1.add(userNameLabel, BorderLayout.NORTH);
        userPanel1.add(userNameTextField);
        userNameLabel.setPreferredSize(new Dimension(100, 50));
        userNameTextField.setBackground(Color.white);
        userNameTextField.setBorder(BorderFactory.createLineBorder(Color.red));
        userNameTextField.setPreferredSize(new Dimension(100, 40));
        userNameTextField.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                userNameTextField.setBorder(BorderFactory.createLineBorder(new Color(122,122,122)));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (userNameTextField.getText().equals("")) {
                    userNameTextField.setBorder(BorderFactory.createLineBorder(Color.red));
                }
                else {
                    userNameTextField.setBorder(BorderFactory.createLineBorder(new Color(122,122,122)));
                }
            }
        });
        userPanel.add(userPanel1);
    }

    private void makePassPanel(JPanel passPanel) {
        JLabel passwordLabel = new JLabel(" Password", SwingConstants.LEFT);
        passPanel.setLayout(new GridLayout(1,2));
        JPanel passPanel1 = new JPanel();
        passPanel1.setLayout(new GridLayout(2,1));
        passPanel1.add(passwordLabel, BorderLayout.NORTH);
        passPanel1.add(passwordTextField);
        passwordLabel.setPreferredSize(new Dimension(100, 50));
        passwordTextField.setPreferredSize(new Dimension(100, 40));
        passwordTextField.setBackground(Color.white);
        passwordTextField.setBorder(BorderFactory.createLineBorder(Color.red));
        passwordTextField.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                passwordTextField.setBorder(BorderFactory.createLineBorder(new Color(122,122,122)));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (passwordTextField.getText().equals("")) {
                    passwordTextField.setBorder(BorderFactory.createLineBorder(Color.red));
                }
                else {
                    passwordTextField.setBorder(BorderFactory.createLineBorder(new Color(122,122,122)));
                }
            }
        });
        passPanel.add(passPanel1);
    }

    private void makeButtonPanel(JPanel buttonPanel) {
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        JPanel buttonPanel1 = new JPanel();
        JPanel buttonPanel2 = new JPanel();
        buttonPanel2.setLayout(new BoxLayout(buttonPanel2, BoxLayout.X_AXIS));
        buttonPanel2.setPreferredSize(new Dimension(50, 30));
        signUp.setBackground(new Color(225,225,225));
        signUp.addActionListener(e -> signUp());
        back.setBackground(Color.white);
        back.addActionListener(e -> back());
        buttonPanel2.add(signUp, BorderLayout.WEST);
        buttonPanel2.add(back, BorderLayout.EAST);
        buttonPanel.add(buttonPanel1);
        buttonPanel.add(buttonPanel2);
    }

    /**
     * sign up.
     *
     */
    private void signUp() {
        String userNameText = userNameTextField.getText();
        String passwordText = passwordTextField.getText();

        if(userNameText.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Username");
        }
        else if(passwordText.equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Password");
        }
        else {
            boolean flag = true;
            for (Admin temp : server.getAdmins()) {
                if (userNameText.equals(temp.getUserName())) {
                    JOptionPane.showMessageDialog(null, "Username is already in use");
                    userNameTextField.setText("");
                    passwordTextField.setText("");
                    userNameTextField.requestFocus();
                    flag = false;
                }
            }
            if (flag) {
                JOptionPane.showMessageDialog(null, "Account has been created.");
                server.addAdmin(userNameText, passwordText, server);
                setVisible(false); //you can't see me!
                dispose();//Destroy the JFrame object
            }
        }
    }

    private void back(){
        setVisible(false); //you can't see me!
        dispose();//Destroy the JFrame object
    }
}
