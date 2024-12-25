package ems.project.ems_project.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table(name = "product")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;
    @Column(name="productname")
    private String name;
    @Column(name = "description")
    private String Description;

    @Column(name = "unit_price")
    private double unit_price;
    @Column(name = "instock")
    private int inStock;
    @Column(name = "photo")
    private String photo;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cart cart;

    @ManyToOne
    private Categorie categorie;

    @OneToMany(mappedBy = "product",fetch = FetchType.LAZY)
    private List<LineItem> lineItems;


    public Product(Long product_id, String name, String description, double unit_price, int inStock, Categorie categorie) {
        this.product_id = product_id;
        this.name = name;
        Description = description;
        this.unit_price = unit_price;
        this.inStock = inStock;
        this.categorie = categorie;
    }
}
