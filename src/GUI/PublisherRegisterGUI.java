package GUI;

import Core.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PublisherRegisterGUI extends JFrame
{
    Server server;

    private JFrame jFrame ;
    private JTextField userNameTextField;
    private JTextField passwordTextField;
    private JTextField nameTextField;
    private JTextField phoneNumberTextField;
    private JTextField addressTextField;
    private JButton signUp;
    private int mod = 0;

    public PublisherRegisterGUI(Server server)
    {
        this.server = server;

        jFrame = new JFrame("online book store");
        jFrame.setSize(700,400);

        userNameTextField = createTextField("", Color.LIGHT_GRAY,200,50);
        passwordTextField = createTextField("",Color.LIGHT_GRAY,200,50);
        phoneNumberTextField = createTextField("",Color.LIGHT_GRAY,200,5);
        addressTextField = createTextField("",Color.LIGHT_GRAY,200,5);


        signUp = creteButton("Sign Up",80,30);

        //Font
        Font font=new Font("Verdana",Font.BOLD,12);

        //Labels
        JLabel jLabelUserName = new JLabel("User name");
        jLabelUserName.setFont(font);
        jLabelUserName.setForeground(Color.white);
        jLabelUserName.setBackground(Color.LIGHT_GRAY);

        JLabel jLabelPassword = new JLabel("Password");
        jLabelPassword.setFont(font);
        jLabelPassword.setForeground(Color.white);
        jLabelPassword.setBackground(Color.LIGHT_GRAY);

        JLabel jLabelPhoneNumber= new JLabel("Phone Number");
        jLabelPassword.setFont(font);
        jLabelPassword.setForeground(Color.white);
        jLabelPassword.setBackground(Color.LIGHT_GRAY);

        JLabel jLabelAddress = new JLabel("Address");
        jLabelPassword.setFont(font);
        jLabelPassword.setForeground(Color.white);
        jLabelPassword.setBackground(Color.LIGHT_GRAY);

        //Panels
        JPanel jPanel = new JPanel();
        jPanel.setPreferredSize(new Dimension(700,100));
        jPanel.setBackground(Color.DARK_GRAY);
        jPanel.add(jLabelUserName);
        jPanel.add(userNameTextField);
        jFrame.add(jPanel);

        JPanel jPanel1 = new JPanel();
        jPanel1.setPreferredSize(new Dimension(700,100));
        jPanel1.setBackground(Color.DARK_GRAY);
        jPanel1.add(jLabelPassword);
        jPanel1.add(passwordTextField);


        JPanel jPanel2 = new JPanel(new GridLayout(2,1));
        jPanel2.setPreferredSize(new Dimension(700,200));
        jPanel2.add(jPanel);
        jPanel2.add(jPanel1);

        JPanel jPanel3 = new JPanel();
        jPanel3.setPreferredSize(new Dimension(700,100));
        jPanel3.setBackground(Color.DARK_GRAY);
        jPanel3.add(signUp);

        jFrame.setLayout(new GridLayout(2,1));
        jFrame.add(jPanel2);
        jFrame.add(jPanel3);
        // jFrame.add(jPanel1,BorderLayout.CENTER);
        jFrame.setVisible(true);
    }

    public JTextField createTextField(String s, Color color, int w, int h){
        JTextField t=new JTextField(s);
        t.setBackground(color);
        t.setPreferredSize(new Dimension(w,h));
        t.setFont(new Font("Arial",19,19));
        return t;
    }

    public JButton creteButton(String s,int w,int h){
        JButton b=new JButton(s);
        b.setPreferredSize(new Dimension(w,h));
        b.setFont(new Font("Arial",19,20));
        b.setBackground(Color.gray);
        b.setOpaque(true);
        return  b;
    }

    private class ActionListenerExample implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource().equals(signUp))
            {

            }
        }
    }
}
