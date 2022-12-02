package PRODUCTSERVICE.PRODUCT.DTO;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ProductDTO {

    private long id;
    private long productNumber;
    private String productName;
    private String type;
    private double price;
    private String imageURL;
    private Timestamp createdDate;
    private Timestamp updateDate;


}
