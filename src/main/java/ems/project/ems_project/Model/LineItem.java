package ems.project.ems_project.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "line_item")
public class LineItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "item_Tprice")
    private double item_Tprice;
    @ManyToOne
    private Product product;
    @ManyToOne
    private LineItem lineItem;
    @ManyToOne
    private Order order;
    @ManyToOne
    private Cart cart;
}
