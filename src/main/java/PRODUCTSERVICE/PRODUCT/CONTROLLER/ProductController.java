package PRODUCTSERVICE.PRODUCT.CONTROLLER;

import PRODUCTSERVICE.PRODUCT.DTO.CatagoryDTO;
import PRODUCTSERVICE.PRODUCT.DTO.ProductDTO;
import PRODUCTSERVICE.PRODUCT.MODEL.Catagory;
import PRODUCTSERVICE.PRODUCT.MODEL.Product;
import PRODUCTSERVICE.PRODUCT.SERVICEIMPL.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ModelMapper modelMapper;


    @GetMapping
    public ResponseEntity<List<Product>> getAllProduct()
    {
        return ResponseEntity.ok().body(productService.getAllProduct());
    }

    public Product createNewProduct(@RequestBody ProductDTO productDTO)
    {
        Product product= convertProductdtoToProduct(productDTO);
        return  productService.createNewProduct(product);
    }




    private ProductDTO convertProductToProductDTO(Product product ) {
        ProductDTO productDTO = modelMapper.map(product, ProductDTO.class);
        return productDTO;
    }

    private Catagory convertCatagorydtoToCatagory(CatagoryDTO catagoryDTO ) {
        Catagory catagory = modelMapper.map(catagoryDTO, Catagory.class);
        return catagory;
    }


    private CatagoryDTO convertCatagoryToCatagoryDTO(Catagory catagory ) {
        CatagoryDTO catagoryDTO = modelMapper.map(catagory, CatagoryDTO.class);
        return catagoryDTO;
    }

    private Product convertProductdtoToProduct(ProductDTO productDTO)
    {
        Product product= modelMapper.map(productDTO, Product.class);
        return product;
    }





}
