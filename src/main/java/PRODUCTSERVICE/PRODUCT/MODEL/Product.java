package PRODUCTSERVICE.PRODUCT.MODEL;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="productNumber", unique = true)
    @NotNull(message = "enter the valid product number")
    @NotEmpty(message = "must fill the product number")
    private long productNumber;

    @Column(name="productName")
    private String productName;

    @Column(name="productType")
    private String type;

    @Column(name="price")
    private double price;

    @Column(name="description")
    private String description;

    @Column(name="image")
    private String imageURL;

    @Column(name="createdDate")
    private Timestamp createdDate;

    @Column(name="updateDate")
    private Timestamp updateDate;
}
