package Core;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer implements Serializable {
    private String username;
    private String password;
    private String telephoneNumber;
    private String IDCard;
    private int creditAccount;
    private ArrayList<Book> purchaseBook;
    private ArrayList<Order> purchaseHistory;
    private Order cart;

    public Customer(String username, String password, String telephoneNumber, String IDCard) {
        this.username = username;
        this.password = password;
        this.telephoneNumber = telephoneNumber;
        this.IDCard = IDCard;
    }

    public void addCredit(int money) {
        creditAccount += money;
    }

    public void payMoney(int money) {
        creditAccount -= money;
    }

    public void makeOrder() {
        cart = new Order(username + System.currentTimeMillis());
    }
}
