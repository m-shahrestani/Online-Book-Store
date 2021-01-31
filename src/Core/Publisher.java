package Core;

import java.util.ArrayList;

public class Publisher
{
    private String name;
    private ArrayList<Book> books;

    public Publisher(String name)
    {
        this.name = name;
        books = new ArrayList<>();
    }


    public void addBook(Book book)
    {

    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Book> getBooks()
    {
        return books;
    }
}
