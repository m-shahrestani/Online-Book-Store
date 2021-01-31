package Core;
import java.util.ArrayList;

public class BookStoreSystem{
    //singleton instance
    private static BookStoreSystem INSTANCE = null;
    private BookRepository bookRepository;
    private ArrayList<Admin> admins;
    private ArrayList<Customer> customers;
    private ArrayList<Publisher> publishers;

    private BookStoreSystem(){

    }

    /**
     * Create a new TankTroubleGUI with singleton.
     *
     * @return INSTANCE.
     */
    public static BookStoreSystem getInstance() {
        if (INSTANCE == null)
            INSTANCE = new BookStoreSystem();
        return INSTANCE;
    }

}
