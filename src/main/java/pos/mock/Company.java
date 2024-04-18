package pos.mock;

public class Company {
    public String name;
    public String Identity;
    public String phone;
    public String email;
    public String address;
    public boolean hasAccounting;

    public Company(String name, String identity, String phone, String email, String address, boolean hasAccounting) {
        this.name = name;
        Identity = identity;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.hasAccounting = hasAccounting;
    }
}
