package Core;

public class Book {
    private  String name;
    private Publisher publisher;
    private String ageRate;
    private String subject;
    private String edition;

    public Book(String name, Publisher publisher, String ageRate, String subject, String edition){
        this.name = name;
        this.publisher = publisher;
        this.ageRate = ageRate;
        this.subject = subject;
        this.edition = edition;
    }
}
