import java.util.ArrayList;

public class DataBase {
    private ArrayList<Publisher> publishers;
    private ArrayList<Admin> admins;
    private ArrayList<Book> books;

    public DataBase() {
        this.publishers = new ArrayList<>();
        this.admins = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void addPublisher(Publisher newPublisher){
        publishers.add(newPublisher);
    }
    public void deletePublisher(Publisher publisher){
        publishers.remove(publisher);
    }
    public void addAdmin(Admin newAdmin){
        admins.add(newAdmin);
    }
    public void deleteAdmin(Admin admin){
        admins.remove(admin);
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Admin> admins) {
        this.admins = admins;
    }

    public ArrayList<Publisher> getPublishers() {
        return publishers;
    }

    public void setPublishers(ArrayList<Publisher> publishers) {
        this.publishers = publishers;
    }
}
