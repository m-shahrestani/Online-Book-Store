package GUI;
import javax.swing.*;
import java.awt.*;

public class BookStoreGUI {
    //singleton instance
    private static BookStoreGUI INSTANCE = null;
    //frame
    private static JFrame frame;

    
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
