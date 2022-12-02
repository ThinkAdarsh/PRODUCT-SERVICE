package PRODUCTSERVICE.PRODUCT.DTO;

import PRODUCTSERVICE.PRODUCT.MODEL.Product;
import lombok.Data;

import java.util.List;

@Data
public class CatagoryDTO {

    private long id;
    private String name;
    private String description;
    private List<Product> details;
}
