package hibernatedemo.pojo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


// Chỉ định đây là persistant class
@Entity
// Chỉ định bảng dữ liệu trong cơ sở dữ liệu
@Table(name = "category")
public class Category implements Serializable {
    // Chỉ định khoá chính
    @Id
    // Chỉ định chiến lược của khoá chính (tự tăng)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Chỉ định cột trong bảng dữ liệu
    // Đặt tên biến trùng với tên cột trong bảng dữ liệu thì nó sẽ tự hiểu không cần chỉ định cột
    //@Column(name = "id")
    private int id;
    private String name;  
    private String description;

    // Map đến bảng product
    @OneToMany(mappedBy = "category")
    private List<Product> products;


    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
