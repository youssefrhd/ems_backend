package ems.project.ems_project.Repository;

import ems.project.ems_project.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepository extends JpaRepository<Product,Long> {
}
