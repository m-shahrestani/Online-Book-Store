public class Customer {
    private int username;
    private String password;
    private String name;
    private String address;
    private String phoneNumber;

    public Customer(int username, String password, String name, String address, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
