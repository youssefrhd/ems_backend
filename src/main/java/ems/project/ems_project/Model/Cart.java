package ems.project.ems_project.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cart")
@Getter
@Setter

public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cart_id;

    @Column(name = "quantity")
    private int quantity;

   @OneToMany(mappedBy = "cart")
    private List<Order> order;
    @OneToOne
    private User user;

    @OneToMany(mappedBy = "cart")
    private List<LineItem> lineItems;

}
