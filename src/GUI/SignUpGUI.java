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

  Color color=Color.LIGHT_GRAY;
        JTextField jTextField =createTextField("  name",color,70,70);
        jTextField.setEditable(false);
        jPanel1.add(jTextField);

        name = createTextField("",Color.LIGHT_GRAY,70,70);
        name.setEditable(true);
        jPanel1.add(name);

        jTextField=createTextField("  address ",color,70,70);
        jTextField.setEditable(false);
        jPanel1.add(jTextField);

        address = createTextField("",Color.LIGHT_GRAY,70,70);
        address.setEditable(true);
        jPanel1.add(address);


        jTextField = createTextField("  phone number",color,70,70);
        jTextField.setEditable(false);
        jPanel1.add(jTextField);

        phoneNumber = createTextField("",Color.LIGHT_GRAY,70,70);
        phoneNumber.setEditable(true);
        jPanel1.add(phoneNumber);


 	done =creteButton("Done",70,70);
        jPanel1.add(done);
        JPanel panel=new JPanel();
        panel.add(jPanel1);
        jFrame.getContentPane().add(panel);
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
   public String getAddress() {
        return address.getText();
    }
 public String getName() {
        return name.getText();
    }

}
