import java.util.ArrayList;

public class Publisher {
    private int username;
    private String password;
    private String publishName;
    private String address;
    private String phoneNumber;
    private ArrayList<Book> books;

    public Publisher(int username, String password, String publishName, String address, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.publishName = publishName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.books = new ArrayList<>();
    }

    public void addNewBook(int id, String name, String subject, Publisher publisher, int price){
        Book newBook = new Book(id, name, subject, publisher, price);
        books.add(newBook);
    }

    public void deleteBook(Book book){
        books.remove(book);
    }

    public int getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPublishName() {
        return publishName;
    }
}
