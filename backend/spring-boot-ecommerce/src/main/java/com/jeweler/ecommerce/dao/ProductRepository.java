package com.jeweler.ecommerce.dao;

import com.jeweler.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "*", allowedHeaders = "*")
public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);

    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);

    @Query(value = "SELECT * FROM product p WHERE p.name like %?1% OR p.description like %?2%", nativeQuery = true)
    Page<Product> findByNameOrDescription(@RequestParam("name") String name, @RequestParam("desc") String desc, Pageable pageable);

}
