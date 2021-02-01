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
    private double score;
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

}