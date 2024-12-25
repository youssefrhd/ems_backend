package ems.project.ems_project.Model;

import ems.project.ems_project.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table(name = "`order`")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long order_id;
    @Column(name = "total_price")
    private double total_price;
    @Column(name = "orderDate")
    private LocalDate orderDate=LocalDate.now();
    @Column(name = "shippedAt")
    private LocalDate shippedAt=this.orderDate.plusDays(3);

    @Column(name = "status")
    private OrderStatus status;
    @OneToOne(mappedBy = "order" , fetch = FetchType.LAZY)
    private Payment payment;

    @ManyToOne(fetch=FetchType.LAZY)
    private Cart cart;

    @OneToMany(mappedBy = "order")
    private List<LineItem> lineItems;


    /*@ManyToOne(fetch=FetchType.LAZY)
    private User user;*/


}
