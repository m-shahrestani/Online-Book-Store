public class Book {
    private int id;
    private String name;
    private String subject;
    private Publisher publisher;
    private int price;

    public Book(int id, String name, String subject, Publisher publisher, int price) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.publisher = publisher;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getSubject() {
        return subject;
    }

    public Publisher getPublisher() {
        return publisher;
    }
}
