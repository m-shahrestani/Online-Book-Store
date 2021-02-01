package Core;

import java.io.Serializable;

public class Book implements Serializable
{
    private String name;
    private Publisher publisher;
    private String author;
    private String ageRate;
    private String subject;
    private String edition;
    private int price;
    private double discount = 0;
    private int number;

    public Book(String name, Publisher publisher, String author, String ageRate, String subject, String edition, int price, int number)
    {
        this.name = name;
        this.publisher = publisher;
        this.author = author;
        this.ageRate = ageRate;
        this.subject = subject;
        this.edition = edition;
        this.price = price;
        this.number = number;
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
