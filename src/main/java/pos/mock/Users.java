package pos.mock;

import com.fasterxml.jackson.annotation.JsonRawValue;
import jakarta.persistence.*;

@Entity
public class Users {
    @Id
    public int id;

    public String name;

    public String username;

    public String password;

    public boolean isPosAvailable;

    public boolean isCashDrawerOpen;

    @Column(columnDefinition = "json")
    @JsonRawValue
    @Transient
    public Company company;

    protected Users() {
    }

    public Users(
            int id,
            String name,
            String username,
            String password,
            boolean isPosAvailable,
            boolean isCashDrawerOpen,
            Company company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.isPosAvailable = isPosAvailable;
        this.isCashDrawerOpen = isCashDrawerOpen;
        this.company = company;
    }
}
