package ems.project.ems_project.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
    @OneToOne
    @JoinColumn(name = "product_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Product product;
    @ManyToOne
    private Order order;

    public LineItem(Long id, int quantity, double item_Tprice, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.item_Tprice = item_Tprice;
        this.product = product;
    }

    public LineItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }
}
