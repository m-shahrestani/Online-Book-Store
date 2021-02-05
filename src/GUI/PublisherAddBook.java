package GUI;

import Core.Publisher;
import Core.Server;

import javax.swing.*;
import java.awt.*;

public class PublisherAddBook extends JFrame
{
    //icon address
    private static final String ICON_PATH = "res/img/icon.png";
    private Server server;
    private Publisher publisher;
    private JTextField nameTextField;
    private JTextField authorTextField;
    private JTextField ageRateTextField;
    private JTextField subjectTextField;
    private JTextField editionTextField;
    private JTextField priceTextField;
    private JTextField numberTextField;
    private JTextArea summeryTextArea;
    private JButton addBookButton;

    public PublisherAddBook(Server server, Publisher publisher)
    {
        setTitle(publisher.getName() + " -Add book");
        ImageIcon icon = new ImageIcon(ICON_PATH);
        setIconImage(icon.getImage());

        this.server = server;
        this.publisher = publisher;

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints constr = new GridBagConstraints();
        constr.insets = new Insets(5, 5, 5, 5);
        constr.anchor = GridBagConstraints.WEST;
        nameTextField = new JTextField(20);
        authorTextField = new JTextField(20);
        ageRateTextField = new JTextField(20);
        subjectTextField = new JTextField(20);
        editionTextField = new JTextField(20);
        priceTextField = new JTextField(20);
        numberTextField = new JTextField(20);
        summeryTextArea = new JTextArea(5,20);
        JScrollPane textAreaScrollPane = new JScrollPane(summeryTextArea);
        textAreaScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        textAreaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        addBookButton = new JButton("Add Book");

        addAllLabels(constr, mainPanel);
        addAllTextFields(constr, mainPanel);
        constr.gridx=1; constr.gridy=7;
        mainPanel.add(textAreaScrollPane, constr);
        constr.gridx=0; constr.gridy=8;
        constr.gridwidth = 2;
        constr.anchor = GridBagConstraints.CENTER;
        addBookButton(mainPanel, constr);

        add(mainPanel);
        pack();
        setVisible(true);
    }
    public void addLabel(String labelDescription, GridBagConstraints constr, JPanel panel, int gridY){
        JLabel label = new JLabel(labelDescription);
        constr.gridx = 0;
        constr.gridy = gridY;
        panel.add(label, constr);
    }
    public void addTextField(JTextField textField, GridBagConstraints constr, JPanel panel, int gridY){
        constr.gridx = 1;
        constr.gridy = gridY;
        panel.add(textField, constr);
    }
    public void addAllLabels(GridBagConstraints constr, JPanel panel){
        addLabel("Name", constr, panel, 0);
        addLabel("Author", constr, panel, 1);
        addLabel("AgeRate", constr, panel, 2);
        addLabel("Subject", constr, panel, 3);
        addLabel("Edition", constr, panel, 4);
        addLabel("Price", constr, panel, 5);
        addLabel("Number", constr, panel, 6);
        addLabel("Summery", constr, panel, 7);
    }
    public void addAllTextFields(GridBagConstraints constr, JPanel panel){
        addTextField(nameTextField, constr, panel, 0);
        addTextField(authorTextField, constr, panel, 1);
        addTextField(ageRateTextField, constr, panel, 2);
        addTextField(subjectTextField, constr, panel, 3);
        addTextField(editionTextField, constr, panel, 4);
        addTextField(priceTextField, constr, panel, 5);
        addTextField(numberTextField, constr, panel, 6);
    }
    public void addBookButton(JPanel panel, GridBagConstraints constr){
        addBookButton.addActionListener(e -> addBook());
        panel.add(addBookButton, constr);
    }

    private void addBook() {
        if (nameTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Name.");
            numberTextField.requestFocus();
        } else if (authorTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Author.");
            authorTextField.requestFocus();
        } else if (ageRateTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter AgeRate.");
            ageRateTextField.requestFocus();
        } else if (subjectTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Subject.");
            subjectTextField.requestFocus();
        } else if (editionTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Edition.");
            editionTextField.requestFocus();
        } else if (priceTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Price.");
            priceTextField.requestFocus();
        } else if (numberTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Address.");
            numberTextField.requestFocus();
        } else if (summeryTextArea.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Summery.");
            summeryTextArea.requestFocus();
        } else {
            try {
                server.addBook(nameTextField.getText(), publisher, authorTextField.getText(), ageRateTextField.getText()
                        , subjectTextField.getText(), editionTextField.getText(), Integer.parseInt(priceTextField.getText())
                        , Integer.parseInt(numberTextField.getText()), summeryTextArea.getText());
                setVisible(false); //you can't see me!
                dispose();//Destroy the JFrame object
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Enter An Integer In Number and Price.");
            }
        }
    }
}