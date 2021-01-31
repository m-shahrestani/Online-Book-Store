package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JFrame jFrame ;
    private JTextField userName;
    private JTextField password;
    private JButton add;
    private JButton login;
    private JComboBox jComboBox;
    private int mod = 0 ;
    public Login(){
//login code ///
   
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

 
    }
