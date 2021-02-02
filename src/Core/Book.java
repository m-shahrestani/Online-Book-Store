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

    public void addScore(int score)
    {

    }

    public void addComment(String comment)
    {

    }

    public void increaseNumberOfBook(int number)
    {

    }

    public void decreaseNumberOfBook(int number)
    {

    }

    public void setBookDiscount(int discount)
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
}
