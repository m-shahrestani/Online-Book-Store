package Core;

import java.io.Serializable;
import java.util.ArrayList;

public class Admin implements Serializable
{
    private String userName;
    private String password;
    private Server server;
    private ArrayList<Publisher> publishersInfo;

    public Admin(String userName, String password, Server server)
    {
        this.userName = userName;
        this.password = password;
        this.server = server;
    }

    public void viewSalesInfo()
    {

    }

    public void changeCommission(Publisher publisher, int Commission)
    {

    }

    public void sortBestPublishers()
    {

    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
