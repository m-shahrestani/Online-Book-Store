package GUI;
import Core.BookStoreSystem;
import Core.Publisher;

import javax.swing.*;
import java.awt.*;

public class BookStoreGUI {

    //singleton instance
    private static BookStoreGUI INSTANCE = null;
    //system
    private BookStoreSystem bookStoreSystem;
    //frame
    private static JFrame frame;
    //Welcome Panel
    private WelcomePanel welcomePanel;
    //typeUser
    private static TypeUser typeUserMenu;
    //login
    private static AdminLoginMenu adminLoginMenu;
    private static CustomerLoginMenu customerLoginMenu;
    private static PublisherLoginMenu publisherLoginMenu;
    //Register
    private static AdminRegisterMenu adminRegisterMenu;
    private static CustomerRegisterMenu customerRegisterMenu;
    private static PublisherRegisterMenu publisherRegisterMenu;
    //Customer panel

    //admin panel

    //publisher panel




    private BookStoreGUI(){
        frame = new JFrame();
        //look and feel
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ignored) {}

        makeFrame();

        frame.setVisible(true);
    }

    /**
     * Create a new TankTroubleGUI with singleton.
     *
     * @return INSTANCE.
     */
    public static BookStoreGUI getInstance() {
        if (INSTANCE == null)
            INSTANCE = new BookStoreGUI();
        return INSTANCE;
    }

    /**
     * make frame
     *
     * The method makes frame for TankTroubleGUI.
     */
    private void makeFrame() {
        frame.setTitle("Online Book store");
        frame.setSize(740, 530);
        frame.setLocation(300, 200);
        frame.setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }
}
