package PRODUCTSERVICE.PRODUCT.SERVICE;

import PRODUCTSERVICE.PRODUCT.MODEL.Product;
import java.util.*;

public interface ProductServiceInterface {

    public List getAllProduct();

    public Product createNewProduct(Product product);

    public Product getProductById(Long id);

    public Product updateProduct(Product product, long id);

    public Product deleteProduct(long id);

}
