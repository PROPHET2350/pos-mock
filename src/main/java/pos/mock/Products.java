package pos.mock;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products {

    @Id
    public Long id;

    public String name;

    public float price;

    public int stock;

    public int category;

    public String img;

    public String code;

    protected Products() {
    }

    public Products(Long id, String name, float price, int stock, int category, String img, String code) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
        this.img = img;
        this.code = code;
    }
}
