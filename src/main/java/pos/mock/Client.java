package pos.mock;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    public Long id;
    public String identity;
    public String name;
    public String phone;
    public String email;
    public String address;

    protected Client() {
    }

    public Client(Long id, String identity, String name, String phone, String email, String address) {
        this.id = id;
        this.identity = identity;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
}
