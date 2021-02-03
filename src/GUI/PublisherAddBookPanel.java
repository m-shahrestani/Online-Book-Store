package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PublisherAddBookPanel extends JPanel
{
    private JTextField nameTextField;
    private JTextField authorTextField;
    private JTextField ageRateTextField;
    private JTextField subjectTextField;
    private JTextField editionTextField;
    private JTextField priceTextField;
    private JTextField numberTextField;
    private JTextArea summeryTextArea;

    public PublisherAddBookPanel()
    {
        setLayout(new GridBagLayout());
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
        addAllLabels(constr, this);
        addAllTextFields(constr, this);
        constr.gridx=1; constr.gridy=7;
        add(summeryTextArea, constr);
        constr.gridx=0; constr.gridy=8;
        constr.gridwidth = 2;
        constr.anchor = GridBagConstraints.CENTER;
        addBookButton(this, constr);
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
        JButton addBookButton = new JButton("Add Book");
        panel.add(addBookButton, constr);
    }

    public String getNameTextField() {
        return nameTextField.getText();
    }

    public String getAuthorTextField() {
        return authorTextField.getText();
    }

    public String getAgeRateTextField() {
        return ageRateTextField.getText();
    }

    public String getSubjectTextField() {
        return subjectTextField.getText();
    }

    public String getEditionTextField() {
        return editionTextField.getText();
    }

    public int getPriceTextField() {
        return Integer.parseInt(priceTextField.getText());
    }

    public int getNumberTextField() {
        return Integer.parseInt(numberTextField.getText());
    }

    public String getSummeryTextArea() {
        return summeryTextArea.getText();
    }
}
