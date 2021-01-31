public class Customer {
    private int username;
    private String password;
    private String name;
    private String address;
    private String phoneNumber;
    private Cart cart;

    public Customer(int username, String password, String name, String address, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        cart = new Cart(this);
    }

    public void addBookToCart(Book book){
        cart.addBook(book);
    }

    public void removeBook(Book book){
        cart.deleteBook(book);
    }

    public int getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
