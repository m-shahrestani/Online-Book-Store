package GUI;

import Core.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI
{
    Server server;

    private JFrame jFrame ;
    private JTextField userName;
    private JTextField password;
    private JButton login;
    private JComboBox jComboBox;
    private int mod = 0 ;

    public LoginGUI(Server server)
    {
        this.server = server;

        jFrame = new JFrame("online book store");
        jFrame.setSize(700,400);

        userName = createTextField("",Color.LIGHT_GRAY,200,50);
        password = createTextField("",Color.LIGHT_GRAY,200,50);
        login = creteButton("log in",80,30);
        //JComboBox
        String[] combo = {"Admin" , "Customer" , "Publisher"};
        jComboBox = new JComboBox(combo);
        jComboBox.setSelectedIndex(2);
        jComboBox.setPreferredSize(new Dimension(120,30));
        jComboBox.setBackground(Color.LIGHT_GRAY);
        jComboBox.setSize(20,40);
        actionHandlerComboBox();
        //labels
        JLabel jLabelUserName = new JLabel("user name");
        JLabel jLabelPassword = new JLabel("password");
      c
        jLabelUserName.setFont(font);
        jLabelUserName.setForeground(Color.white);
        jLabelUserName.setBackground(Color.LIGHT_GRAY);
        //panels
        JPanel jPanel = new JPanel();
        jPanel.setPreferredSize(new Dimension(700,100));
        jPanel.setBackground(Color.DARK_GRAY);
        jPanel.add(jLabelUserName);
        jPanel.add(userName);
        jFrame.add(jPanel);

        JPanel jPanel1 = new JPanel();
        jPanel1.setPreferredSize(new Dimension(700,100));
        jPanel1.setBackground(Color.DARK_GRAY);
        jPanel1.add(jLabelPassword);
        jPanel1.add(password);

        JPanel jPanel2 = new JPanel(new GridLayout(2,1));
        jPanel2.setPreferredSize(new Dimension(700,200));
        jPanel2.add(jPanel);
        jPanel2.add(jPanel1);

        JPanel jPanel3 = new JPanel();
        jPanel3.setPreferredSize(new Dimension(700,100));
        jPanel3.setBackground(Color.DARK_GRAY);
        jPanel3.add(login);
        jPanel3.add(jComboBox);

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
    public void actionHandlerComboBox(){
        jComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JComboBox comboBox = (JComboBox) event.getSource();
                Object selected = comboBox.getSelectedItem();
                if ("Admin".equals(selected)) {
                    mod = 1;
                } else if ("Customer".equals(selected)) {
                    mod = 2;
                }
                else if ("Publisher".equals(selected)) {
                    mod = 3;
                }
            }
        });
    }

    private class ActionListenerExample implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource().equals(login)){
                if (mod == 1){

                }
                else if (mod == 2){

                }
                else if (mod == 3){

                }
            }
        }
    }
}