package PRODUCTSERVICE.PRODUCT.REPOSITORY;

import PRODUCTSERVICE.PRODUCT.MODEL.Catagory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatagoryRepository extends JpaRepository<Catagory, Long> {
}
