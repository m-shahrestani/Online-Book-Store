import javax.swing.*;
import java.awt.*;

public class SignUpGUI extends JFrame {
    private JButton done;
    private JTextField name;
    private JTextField address;
    private JTextField phoneNumber;
    private JFrame jFrame;

    public  SignUpGUI(){
      
 jFrame=new JFrame("Info");
        jFrame.setBackground(Color.LIGHT_GRAY);
        jFrame.setSize(new Dimension(700,700));
        jFrame.setResizable(false);
        jFrame.setLocation(600,150);
        JPanel jPanel1=new JPanel(new GridLayout(7,2));
        jPanel1.setPreferredSize(new Dimension(690,790));
        jPanel1.setBackground(Color.DARK_GRAY);
        JLabel jLabel=new JLabel(" Name :");
        Font font=new Font("Verdana",Font.BOLD,12);
        jLabel.setFont(font);
        jLabel.setForeground(Color.white);
        jPanel1.add(jLabel);
        JLabel jLabel1=new JLabel(" Value :");
        jLabel.setBackground(Color.LIGHT_GRAY);
        jLabel1.setFont(font);
        jLabel1.setForeground(Color.white);
        jPanel1.add(jLabel1);

    }

    

}
