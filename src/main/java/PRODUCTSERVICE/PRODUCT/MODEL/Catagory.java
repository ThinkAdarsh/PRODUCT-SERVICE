package PRODUCTSERVICE.PRODUCT.MODEL;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="catagory")
public class Catagory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="catagoryName")
    private String name;

    @Column(name="description")
    private String description;

    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name ="product_catagory", referencedColumnName = "id")
    private List<Product> details;

}
