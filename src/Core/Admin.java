package Core;

import java.io.Serializable;
import java.util.ArrayList;

public class Admin implements Serializable {
    private String username;
    private String password;
    private ArrayList<Publisher> publishers;
    private ArrayList<Customer> customers;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
