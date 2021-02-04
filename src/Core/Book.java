package Core;

import java.io.Serializable;
import java.util.ArrayList;

public class Book implements Serializable
{
    private String name;
    private Publisher publisher;
    private String author;
    private String ageRate;
    private String subject;
    private String edition;
    private int price;
    private int number;
    private String summery;
    private double discount = 0;
    private double score = 5;
    private double scoreNumber;
    private ArrayList<String> comments;


    public Book(String name, Publisher publisher, String author, String ageRate, String subject, String edition, int price, int number, String summery)
    {
        this.name = name;
        this.publisher = publisher;
        this.author = author;
        this.ageRate = ageRate;
        this.subject = subject;
        this.edition = edition;
        this.price = price;
        this.number = number;
        this.summery = summery;
        comments = new ArrayList<>();
    }

    protected void addScore(int score)
    {

    }

    protected void addComment(String comment)
    {

    }

    protected void increaseNumber(int number)
    {

    }

    protected void decreaseNumber(int number)
    {

    }

    protected void setBookDiscount(int discount)
    {

    }

    public String getName()
    {
        return name;
    }

    public Publisher getPublisher()
    {
        return publisher;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getAgeRate()
    {
        return ageRate;
    }

    public String getSubject()
    {
        return subject;
    }

    public String getEdition()
    {
        return edition;
    }

    public int getPrice()
    {
        return price;
    }

    public int getNumber()
    {
        return number;
    }

    public String getSummery()
    {
        return summery;
    }

    public double getDiscount()
    {
        return discount;
    }

    public double getScore()
    {
        return score;
    }

    public ArrayList<String> getComments()
    {
        return comments;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (price != book.price) return false;
        if (!name.equals(book.name)) return false;
        if (!publisher.equals(book.publisher)) return false;
        if (!author.equals(book.author)) return false;
        if (!ageRate.equals(book.ageRate)) return false;
        if (!subject.equals(book.subject)) return false;
        if (!edition.equals(book.edition)) return false;
        return summery.equals(book.summery);
    }

    @Override
    public int hashCode()
    {
        int result = name.hashCode();
        result = 31 * result + publisher.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + ageRate.hashCode();
        result = 31 * result + subject.hashCode();
        result = 31 * result + edition.hashCode();
        result = 31 * result + price;
        result = 31 * result + summery.hashCode();
        return result;
    }
}