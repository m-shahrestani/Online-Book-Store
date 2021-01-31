import java.util.ArrayList;

public class DataBase {
    private ArrayList<Customer> customers;
    private ArrayList<Publisher> publishers;
    private ArrayList<Admin> admins;
    private ArrayList<Book> books;

    public DataBase() {
        this.customers = new ArrayList<>();
        this.publishers = new ArrayList<>();
        this.admins = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void showSameSubjectBooks(String subject){
        for (Book book : books){
            if(book.getSubject().equals(subject)){
                System.out.println(book.getSubject()+" "+book.getName()+" "+book.getId()+" "+book.getPublisher().getPublishName()+" "+book.getPrice());
            }
        }
    }
    public void showSamePublisherBooks(String publisherName){
        for (Book book : books){
            if(book.getPublisher().getPublishName().equals(publisherName)){
                System.out.println(book.getSubject()+" "+book.getName()+" "+book.getId()+" "+book.getPublisher().getPublishName()+" "+book.getPrice());
            }
        }
    }

    public void addNewCustomer(Customer newCustomer){
        customers.add(newCustomer);
    }
    public void deleteCustomer(Customer customer){
        customers.remove(customer);
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
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Publisher> getPublishers() {
        return publishers;
    }

    public void setPublishers(ArrayList<Publisher> publishers) {
        this.publishers = publishers;
    }
}
