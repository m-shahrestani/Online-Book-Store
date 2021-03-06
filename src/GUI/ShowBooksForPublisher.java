package GUI;

import Core.Book;
import Core.Publisher;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShowBooksForPublisher extends JFrame
{
    //icon address
    private static final String ICON_PATH = "res/img/img/icon.png";
    private Publisher publisher;
    private ArrayList<Book> books;
    private ArrayList<JPanel> bookPanels;

    public ShowBooksForPublisher(Publisher publisher)
    {
        setTitle(publisher.getName() + " -Publisher's Books");
        ImageIcon icon = new ImageIcon(ICON_PATH);
        setIconImage(icon.getImage());
        this.publisher = publisher;
        bookPanels = new ArrayList<>();
        JPanel panel = showAllPublisherBook();

        add(panel);
        pack();

        setVisible(true);
    }

    public JLabel bookInformationLabel(String description){
        return new JLabel(description);
    }
    public JPanel bookPanelHeader(){
        JPanel bookPanelHeader = new JPanel(new GridLayout(1, 8));
        bookPanelHeader.add(bookInformationLabel("Book Name"));
        bookPanelHeader.add(bookInformationLabel("Author"));
        bookPanelHeader.add(bookInformationLabel("Age Rate"));
        bookPanelHeader.add(bookInformationLabel("Subject"));
        bookPanelHeader.add(bookInformationLabel("Edition"));
        bookPanelHeader.add(bookInformationLabel("Price"));
        bookPanelHeader.add(bookInformationLabel("Number"));
        bookPanelHeader.add(bookInformationLabel(""));
        return bookPanelHeader;
    }
    public JTextField bookInformationField(String information){
        JTextField bookInformationField = new JTextField(information, 10);
        bookInformationField.setEditable(false);
        return bookInformationField;
    }
    public JPanel bookPanel(Book book){
        JPanel bookPanel = new JPanel(new GridLayout(1, 8));
        bookPanel.add(bookInformationField(book.getName()));
        bookPanel.add(bookInformationField(book.getAuthor()));
        bookPanel.add(bookInformationField(book.getAgeRate()));
        bookPanel.add(bookInformationField(book.getSubject()));
        bookPanel.add(bookInformationField(book.getEdition()));
        bookPanel.add(bookInformationField(String.valueOf(book.getPrice())));
        bookPanel.add(bookInformationField(String.valueOf(book.getNumber())));
        bookPanel.add(showSummery(book));
        return bookPanel;
    }
    public void bookSummery(Book book){
        JFrame summeryFrame = new JFrame(book.getName()+" -Summery");
        JTextArea summery = new JTextArea(5, 20);
        ImageIcon icon = new ImageIcon(ICON_PATH);
        summeryFrame.setIconImage(icon.getImage());
        summery.setText(book.getSummery());
        summeryFrame.add(summery);
        summeryFrame.setSize(500, 500);
        summeryFrame.setVisible(true);
    }
    public JButton showSummery(Book book){
        JButton showSummery = new JButton("Show Summery");
        showSummery.addActionListener(e -> bookSummery(book));
        return showSummery;
    }
    public JPanel showAllPublisherBook(){
        books = publisher.getBooks();
        JPanel mainPanel = new JPanel();
        GridLayout gridLayout = new GridLayout();
        gridLayout.setColumns(1);
        gridLayout.setRows(20);
        gridLayout.setVgap(7);
        mainPanel.setLayout(gridLayout);
        mainPanel.add(bookPanelHeader());
        for (int i = 0 ; i < books.size() ; i++){
            bookPanels.add(bookPanel(books.get(i)));
            mainPanel.add(bookPanels.get(i));
        }
        return mainPanel;
    }
}