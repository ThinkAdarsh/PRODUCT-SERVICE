package PRODUCTSERVICE.PRODUCT.SERVICEIMPL;

import PRODUCTSERVICE.PRODUCT.MODEL.Product;
import PRODUCTSERVICE.PRODUCT.REPOSITORY.ProductRepository;
import PRODUCTSERVICE.PRODUCT.SERVICE.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductServiceInterface {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product createNewProduct(Product product) {
       return  productRepository.save(product);

    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product updateProduct(Product product, long id) {
        Product updateproduct= productRepository.findById(id).orElseThrow(()->new RuntimeException("invalid id.."));
        updateproduct.setProductName(product.getProductName());
        updateproduct.setProductNumber(product.getProductNumber());
        updateproduct.setType(product.getType());
        updateproduct.setPrice(product.getPrice());
        updateproduct.setDescription(product.getDescription());

        return productRepository.save(updateproduct);

    }

    @Override
    public Product deleteProduct(long id) {
       Product deleteproduct= productRepository.findById(id).orElseThrow(()->new RuntimeException("invalid id..."));
           productRepository.delete(deleteproduct);
           return deleteproduct;
    }
}
