package pos.mock;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {

    @Id
    public Long id;

    public String name;

    public String img;

    protected Category() {
    }

    public Category(Long id, String name, String img) {
        this.id = id;
        this.name = name;
        this.img = img;
    }
}
