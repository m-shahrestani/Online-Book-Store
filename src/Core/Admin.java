package Core;

import java.io.Serializable;

public class Admin implements Serializable
{
    private String userName;
    private String password;
    private Server server;

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

}
